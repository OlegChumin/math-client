# Math Client Service

## Описание
`Math Client` — это Spring Boot приложение, которое выступает в роли клиента для `Calculator Service`. 
Сервис предоставляет API для выполнения базовых математических операций (сложение, вычитание, умножение, деление) 
через отправку запросов к `Calculator Service`.

## Возможности
- Прокси API для базовых математических операций:
    - **Сложение (`sum`)**
    - **Вычитание (`subtract`)**
    - **Умножение (`multiply`)**
    - **Деление (`divide`)**
- Централизованное логирование запросов и ответов.
- Обработка ошибок, включая защиту от деления на ноль.
- Демонстрация интеграции между микросервисами с использованием `RestTemplate`.

## Используемые технологии
- **Java 17**: Основной язык программирования.
- **Spring Boot**:
    - Разработка REST API.
    - Управление конфигурациями.
- **Lombok**: Упрощение шаблонного кода.
- **SLF4J**: Логирование.
- **Gradle**: Управление зависимостями и сборка проекта.

## Конфигурация
Для работы сервиса необходимо настроить URL `Calculator Service` в файле `application.yml`:

```yaml
calculator-service:
  url: http://localhost:8080/api/calculator
