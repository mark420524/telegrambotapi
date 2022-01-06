## telegrambotapi

封装java版的telegrambotapi功能，包含tg各种方法的调用

### 使用方法

调用不同的`command`，返回不同`response`

```java
TelegramBots<GetMyCommandsResponse> t = new DefaultBots("", true);
try {
	Map<String,Object> params = new HashMap<>();
    GetMyCommandsResponse r = t.callMethod(MethodEnum.GETMYCOMMANDS, params);
    System.out.println(r);
} catch (Exception e) {
	e.printStackTrace();
}
```

