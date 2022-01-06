## telegrambotapi

封装java版的telegrambotapi功能，包含tg各种方法的调用

### 使用方法

调用不同的`command`，返回不同`response`

```java
TelegramBots<BooleanResponse> t = new DefaultBots(token, true);
try {
    SetCommandParams params = new SetCommandParams();
    List<BotCommand> list = new ArrayList<>();
    BotCommand command = new BotCommand();
    command.setCommand("chatwithme");
    command.setDescription("you can send a message to me");
    list.add(command);
    BotCommand command1 = new BotCommand();
    command1.setCommand("welcome");
    command1.setDescription("hi buddy, welcome to my bot");
    list.add(command1);
    params.setCommands(list);
    BooleanResponse r = t.callMethod(MethodEnum.SETMYCOMMANDS, params);
    System.out.println(r);
} catch (Exception e) {
    e.printStackTrace();
}
```

