package com.po;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000116683880";

    // 商户私钥，您的PKCS8格式RSA2私钥
    //public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCu2UMZX9IEXn+H2ptW9scAHoG+J0SSbmTz2EZb+44j1cM0WqGgPat7Edi3HVp0y4yj5qCpZxfKy1Dm2jwUAyWbBM/PyrxqeA0K9/kUDYIpF6PgT41EdLkwL2o4gg/bM+0CCdNbkghRxHbV7VC+z71ebEMiKDRo4Zg0s9LJZzt5jywkdAsAXeSIj49nXDAURduhik2K18xHKmPeXyVculQg1IQ/fBTIZWZXw1ViFa3q2NOg/LBkiguduIJHX9yhoTe69RjiiHYg9gDgl6XvDyWFV1jmIc/5pht3AOOJU57RAS+qTbF6Y+D5EzpSr4WSKwwqYQbKcofOrEaMl97HmOzBAgMBAAECggEARV/Y2rGFL8yaxzl6lwe1L5vrGJqV/4+jqIiwagCmhhtjp1sqc9zkNCGBni4cXOkCdWmlZ3GLJCCFigMfAUW6XwaKucST+56EdkyrXER713gUwoRt5bJ2Y+L8P02DoxK4QC3L2bJYcLEGAZ12gy8D0PodrOjM2qxf6tFKmjTGiVUWEbW+oi9fwZmnT1bcdW3ESaxUf5GoNE/yoiNBnFSq6qOTQ3Vwegxi7LDFxkPXI4vOQvw5z2/q8MQ8NRfs7IhNMKdJjkLtkwwoh36nPUnlLhOdyMf6HQ20RCw3WIY7Cyfz3AOpo1/KFZTHiJkxdLbBYmQPFM1SN1aA4jEzTh8CvQKBgQD57mJRgRiZnIOIg+kM2SNN5dhQ+377qIZ6/Qf/xdUlgCoM9S+b/0nL4LM2H2gfn0OZr0Zv09hz1surPg1hUmcoUO3cZ/9HrRAfQtumAWCtfXhREaqxvieYSjt6HxsihCgJEHQMuWbOPOLuQsiKcGdo+xTW0ytUMKi1JEjGPhdAwwKBgQCzGCbtaR6LEov7xgV0zdBNIryqrg/WBmAvtFcFdZi+NE6Ivr+eqhZnzUdeJmqstmlodsW7B9xJeQ8mbulgR8ggZbOcUIM3jL1Vd0ShqbhUNwBWcEFV9vmDTdh8f0N8l3u9uOp43UntwOpld+hg4Y2MRiI5JxdnZUKafNC4ZboEKwKBgQDIVObj87l3L3hTDYDZNpdQ0kIwr1Yae/vHS1iFENsHoxKRrlpKDTfmvqaHZGc+qZcy8cZgzoq6V1qLWUK6VqWvMCdousdpeXPpytpq1sHabi7ptGKA9C2iqSXBfntukEXS9ig/JsEb4Lv5RPif1vdcs50BkOQzKImiIIJgvNZApwKBgGbMrDuGJUQKx1MjnSoooTJFiCooc2qUik2XpIO7tosnFxUi+HaohufaSubeAklVAzg1RNZQcr+xv2J+M3NSgKsn9Wr6Q/d0z5DpPvnUo7ujPoxfLwGbHCmkW2lK23/+q8aBCAWMb80K+QB5TWee0FL+RtKrf6GX3B01G9FcguO1AoGBALim7j3BR1FHcJQujV5ZHGaOH+J7ZWXMcN4LSxwKwiu6DeG790VPu0con0EtkhsmTuZeDhER8SS0KMzdhaGN2utcDxV+D9xFt40jCEmQRY7QFUL3z7cHmohEAtK3zb4FQKH4OYGMQV4xiqFoBevN5rLLFhSl/+3Mlu6ZKNWxGLTu";
    //public static String APP_PRIVATE_KEY ="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCu2UMZX9IEXn+H2ptW9scAHoG+J0SSbmTz2EZb+44j1cM0WqGgPat7Edi3HVp0y4yj5qCpZxfKy1Dm2jwUAyWbBM/PyrxqeA0K9/kUDYIpF6PgT41EdLkwL2o4gg/bM+0CCdNbkghRxHbV7VC+z71ebEMiKDRo4Zg0s9LJZzt5jywkdAsAXeSIj49nXDAURduhik2K18xHKmPeXyVculQg1IQ/fBTIZWZXw1ViFa3q2NOg/LBkiguduIJHX9yhoTe69RjiiHYg9gDgl6XvDyWFV1jmIc/5pht3AOOJU57RAS+qTbF6Y+D5EzpSr4WSKwwqYQbKcofOrEaMl97HmOzBAgMBAAECggEARV/Y2rGFL8yaxzl6lwe1L5vrGJqV/4+jqIiwagCmhhtjp1sqc9zkNCGBni4cXOkCdWmlZ3GLJCCFigMfAUW6XwaKucST+56EdkyrXER713gUwoRt5bJ2Y+L8P02DoxK4QC3L2bJYcLEGAZ12gy8D0PodrOjM2qxf6tFKmjTGiVUWEbW+oi9fwZmnT1bcdW3ESaxUf5GoNE/yoiNBnFSq6qOTQ3Vwegxi7LDFxkPXI4vOQvw5z2/q8MQ8NRfs7IhNMKdJjkLtkwwoh36nPUnlLhOdyMf6HQ20RCw3WIY7Cyfz3AOpo1/KFZTHiJkxdLbBYmQPFM1SN1aA4jEzTh8CvQKBgQD57mJRgRiZnIOIg+kM2SNN5dhQ+377qIZ6/Qf/xdUlgCoM9S+b/0nL4LM2H2gfn0OZr0Zv09hz1surPg1hUmcoUO3cZ/9HrRAfQtumAWCtfXhREaqxvieYSjt6HxsihCgJEHQMuWbOPOLuQsiKcGdo+xTW0ytUMKi1JEjGPhdAwwKBgQCzGCbtaR6LEov7xgV0zdBNIryqrg/WBmAvtFcFdZi+NE6Ivr+eqhZnzUdeJmqstmlodsW7B9xJeQ8mbulgR8ggZbOcUIM3jL1Vd0ShqbhUNwBWcEFV9vmDTdh8f0N8l3u9uOp43UntwOpld+hg4Y2MRiI5JxdnZUKafNC4ZboEKwKBgQDIVObj87l3L3hTDYDZNpdQ0kIwr1Yae/vHS1iFENsHoxKRrlpKDTfmvqaHZGc+qZcy8cZgzoq6V1qLWUK6VqWvMCdousdpeXPpytpq1sHabi7ptGKA9C2iqSXBfntukEXS9ig/JsEb4Lv5RPif1vdcs50BkOQzKImiIIJgvNZApwKBgGbMrDuGJUQKx1MjnSoooTJFiCooc2qUik2XpIO7tosnFxUi+HaohufaSubeAklVAzg1RNZQcr+xv2J+M3NSgKsn9Wr6Q/d0z5DpPvnUo7ujPoxfLwGbHCmkW2lK23/+q8aBCAWMb80K+QB5TWee0FL+RtKrf6GX3B01G9FcguO1AoGBALim7j3BR1FHcJQujV5ZHGaOH+J7ZWXMcN4LSxwKwiu6DeG790VPu0con0EtkhsmTuZeDhER8SS0KMzdhaGN2utcDxV+D9xFt40jCEmQRY7QFUL3z7cHmohEAtK3zb4FQKH4OYGMQV4xiqFoBevN5rLLFhSl/+3Mlu6ZKNWxGLTu";
     public static String APP_PRIVATE_KEY ="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCV8IjEDglZ02ZyDborKIvQwIICWPWNQjwF3GyMJTHidx1Wj+ZZJsRfubedobkvu3EYYvijgPOUQ4yN99dDbijEqOg5m6TxoQ/Ff7Yyykl01JLAsuww+S44IxphaBst2HcTkGVio/6l4+rLcVwDwNCkijtUAfL0P8/5QCeRIRURoO3i2PSguSeO5DCG1l1x5XeiGP9whVtR/gAGobiHAMp7QA1Dp19htqm1t4Id0JNQJAAFEo1Vw4PGJ4dWAaXPKAPP2FzsWvi6OS2UP/BFgY5FDp7EKhDCDa7SI2OB48J8gAfoXFfChqfpsIsB5aJAJrIDeXC0oTTSTcpv/+9EgFHNAgMBAAECggEAZVMnGVZi+1Dg6jJcnM3JrkhpkyyKw+r+pPdQY2S/UUstiFG2WIjaK9ZVPzEK9Da3NsOrQtLhyE/drBLQZcELy9pZFJUZ4i/1eIHVnn0VJt6ATbib5Hx/v2/5Y9n2hATEc3QhD4fDjld3VARHKkIivQ6tCRhIFscIxGeWVX0Fv+LwrNIcTrtPz97U/JxwyQUuzSF31Q8z4j1ClnZkQJJGxdTlanfZ+lWwpkH0dex+eqfr+U6LYNzP3mIvtSePmLUxVV0VrSofRcOnqdedjK1d2WsWN5Ge0veactDwkiqNqWJ31eDAEVzYV8kxJlHMmhTrNmaRJsQA8Q4zKAgtoP2AAQKBgQD4CMcJRRXsO4QOS1xtYOFOG1u7MHw1w109C0wDOy66eRuNXvJx6Q+NkW5gKOWvxQArfB0w2YDuVPOzT+sYYlsymWOD9LuN1HzEQJvbNC+eSa0aFAayIOiPVVQEcZdQzRh0CIuyngyLEP2XJUjPuGjlp/cbqWZm3OWi8ggtapGUYQKBgQCawUSMdoHCqO635nlOL2jVcY7+wXmOtHKtCosCqpScE71n2c8q9ihXWx1TNLofnietIQlPoiG/Rf/0cZtVj+q5ebPb3hkOgUed9yjZTBPpSKWuqT+5yzBUJOIIqgmrpp4jFg3tuz8NATLmo5/bhnAUbkX866mOwwHXRWTD1T507QKBgDR4ZuKnIsQeswjzGFJrND55uyYWU7Br68WGJkZotrHr/NAjTdabHxcrtNXS0QQmAKsyTlqPKJ9CiWtddLZr2C8UE+FOXH7cfKhnopD0sT4jB+OEaQY1v/zSaDuobAJD4PBq/mKC3NRue7cFxCltMYOjzLqlU2xfPpUB7ojtCm8BAoGBAJJactSQApmwn8pleZU6et9Y/M3q9WXDO6xwixSjc9XDSV3ce/L6Rx6OOcaF1/us24L8+kxIXbgBoFVx12BssaRk93bYrUOteahnpUcTjsURgjcTMwQnp/X7x5RAEtM1yNoPsm6ApdlLp/K9DaJTms2HmELgMEOmIqiOpQQbOGzlAoGBAI4D9r/Fice50+D//s7KbwygVJqt048f5QAMvI2B48lzs+7c01LFasTsaoSTSxgXosN9OGXvdpxmwvDcW+kfa5ceqwPCyX9sQH9dKOXXE2eyIytMgw2yEsUHiBifGbc8nPu8jINwhN7TFqFwvaxJIxiCXJfCgDhaSHPNB6SVisQ1";
      // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    //public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp1nsIlDtEyPfoqy4lnk0LcHbjjzd6bM2Do6rGLThmK3J3Rcl/2sDGcCsmynB+fpSwEjOjwo35rFZQ3Eft7EsGVmGNGatja6A68CUfU6WxZtaEPKobkQZKDDOqjeX6AUqygJIxL+9WtMY81UhhXAoKxDYrl2xe98qZPHEx2DCTbe5CkApBMCRR+rEAvMEfPYhK9j31xQfKGMx5xZwhXPzVlQIphXVAAgPHcU+woVQ4tEH+YsbpEbEkFwzbIoSkx3sT3kC6GCfsHjEifefnyx5JEsq6yoHRaA8Jtqpvk8SkFrmPzdH0RFesRPMpIgLwoXsmDjVg1Z5ZtYKGbqLuZD6SwIDAQAB";
   public static String ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo/uirvbymssToGjKqcLCAVavwGXH1eZK19ObWawqFTI8SsdHABAy9eKoiejI9R0POL06S4sidGNUixYyBTYP3sE5MJHCCmFVCSXcfQUOmJdG80vFQT3rtoSu8D8CfMtBApXCrPlOvZqAgeSVOESGOnhaYSfE4Fg21fj9+H1T+LhpLAs6iyX5XQ1mSavtkgaeQLz5b8AvU1ccsATvqMCrn+RK75JhIBbvNEqp51g7NTtGUMs7b0Eyz2ecWPcniO8df7Iu8MOzNqIH/PG3hWwc69VvvyllfklJTUksAX886tqkdQkfxySFbohtK1A9ltIAiP3HL3+XyDtYbtavjnIIbwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8088/alipay.trade.page.pay-JAVA-UTF-8/api/pay/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8088/return_url.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 日志路径头
    public static String log_path = "F:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
