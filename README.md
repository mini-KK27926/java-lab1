# ПРОЦЕДУРНОЕ ПРОГРАММИРОВАНИЕ
ЛАБОРАТОРНАЯ РАБОТА №1

## Состав
- `Main.java` — основной класс с запуском программы
- `MethodsConsitionsCyclesArray.java` — класс с методами
## Структура заданий

### 1. Методы
- `int sumLastNums(int x)` — сумма двух последних цифр числа.
```java
- public int sumLastNums(int x) {
        int firstNum = x % 10; //1346  6
        int secondNum = (x / 10) % 10; //4
        return firstNum + secondNum; //4 + 6
    }
- `boolean isPositive(int x)` — проверка, положительное ли число.  
- `boolean isUpperCase(char x)` — проверка, является ли символ заглавной латинской буквой.  
- `boolean isDivisor(int a, int b)` — проверка, делится ли одно число на другое без остатка.  
- `int lastNumSum(int a, int b)` — сумма последних цифр двух чисел.  

### 2. Условия
- `double safeDiv(int x, int y)` — безопасное деление (при `y=0` возвращает `0`).  
- `String makeDecision(int x, int y)` — сравнение двух чисел (`>`, `<`, `=`).  
- `boolean sum3(int x, int y, int z)` — проверка, можно ли сложением двух чисел получить третье.  
- `String age(int x)` — корректное склонение слова «год/года/лет».  
- `void printDays(String x)` — вывод всех дней недели, начиная с указанного (или сообщение об ошибке).  

### 3. Циклы
- `String reverseListNums(int x)` — числа от `x` до `0` в строке.  
- `int pow(int x, int y)` — возведение числа в степень.  
- `boolean equalNum(int x)` — проверка, все ли цифры числа одинаковые.  
- `void leftTriangle(int x)` — вывод треугольника из символов `*`.  
- `void guessGame()` — игра «Угадай число» (от 0 до 9).  

### 4. Массивы
- `int findLast(int[] arr, int x)` — поиск индекса последнего вхождения числа в массив.  
- `int[] add(int[] arr, int x, int pos)` — добавление элемента в массив на позицию.  
- `void reverse(int[] arr)` — реверс массива.  
- `int[] concat(int[] arr1, int[] arr2)` — объединение двух массивов.  
- `int[] deleteNegative(int[] arr)` — удаление отрицательных элементов из массива.  

