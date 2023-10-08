# FrequencyControllerApi

Method | HTTP request | Description
------------ |--------------| ------------ 
[**calculateFrequency**](FrequencyControllerApi.md#calculatefrequencyapi) | **POST** /calculate-frequency | Вычисление частоты встречающихся символов в заданной строке

<a name="calculateFrequency"></a>
# **calculateFrequency**
> List&lt;FrequencyResponseDTO&gt; calculateFrequency(body)

Вычисление частоты встречающихся символов в заданной строке

### Example
```java
// Import classes:
// import io.swagger.client.ApiException;
// import io.swagger.client.FrequencyControllerApi;


FrequencyControllerApi apiInstance = new FrequencyControllerApi();
FrequencyRequestDTO body = new FrequencyRequestDTO(); // FrequencyRequestDTO |
try{
    List<FrequencyResponseDTO> result = apiInstance.calculateFrequency(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FrequencyControllerApi#calculateFrequency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description | Notes
------------ |--------------| ------------ | ------------ 
**request** | [**FrequencyRequestDTO**](FrequencyRequestDTO.md) | Входная строка

### Return type

[**List&lt;FrequencyResponseDTO&gt;**](FrequencyResponseDTO.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json