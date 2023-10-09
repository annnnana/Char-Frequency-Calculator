# FrequencyControllerApi

| Method                                                 | HTTP request                  | Description                                                 |
|--------------------------------------------------------|-------------------------------|-------------------------------------------------------------|
| [**calculateFrequency**](README.md#calculateFrequency) | **POST** /calculate-frequency | Вычисление частоты встречающихся символов в заданной строке |

<a name="calculateFrequency"></a>
# **calculateFrequency**
> List&lt;FrequencyResponseDTO&gt; calculateFrequency(body)

**Вычисление частоты встречающихся символов в заданной строке.**

Метод `calculateFrequency` принимает запрос `FrequencyRequestDTO`, извлекает строку из этого запроса и вычисляет частоту появления каждого символа в строке. 
Затем он возвращает список `FrequencyResponseDTO`, отсортированный в порядке убывания частоты. Каждый элемент списка представляет собой символ и количество его вхождений в строку.

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

| Name        | Type                                              | Description    | Notes |
|-------------|---------------------------------------------------|----------------|-------|
| **request** | [**FrequencyRequestDTO**](FrequencyRequestDTO.md) | Входная строка |       |

### Return type

[**List&lt;FrequencyResponseDTO&gt;**](FrequencyResponseDTO.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json