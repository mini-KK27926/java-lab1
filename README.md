# ПРОЦЕДУРНОЕ ПРОГРАММИРОВАНИЕ
Лабораторная работа №1

## Структура проекта
- `Main.java` — основной класс с запуском программы
- `MethodsConsitionsCyclesArray.java` — класс с методами
## Структура заданий

### 1. Методы
- Задача № 2
- `int sumLastNums(int x)` — сумма двух последних цифр числа
```java
public int sumLastNums(int x) {
        int firstNum = x % 10; 
        int secondNum = (x / 10) % 10; 
        return firstNum + secondNum;
    }
```
- Ввод: 1357 --> Вывод: 12
- Ввод: 81 --> Вывод: 9
- Ввод: 7 --> Вывод: Ошибка

- `boolean isPositive(int x)` — проверка, положительное ли число
```java
public boolean isPositive(int x) {
        return x > 0;
    }
```
- Ввод: 7 --> Вывод: true
- Ввод: -7 --> Вывод: false

- `boolean isUpperCase(char x)` — проверка, является ли символ заглавной латинской буквой
```java
public boolean isUpperCase(char x) {

        return x >= 'A' && x <= 'Z';
    }
```
- Ввод: s --> Вывод: false
- Ввод: л --> Вывод: false
- Ввод: Л --> Вывод: false
- Ввод: S --> Вывод: true

- `boolean isDivisor(int a, int b)` — проверка, делится ли одно число на другое без остатка
```java
public boolean isDivisor (int a, int b){

        return a % b == 0;
    }
```
- Ввод: 3 2 --> Вывод: false
- Ввод: 10 5 --> Вывод: true

- `int lastNumSum(int a, int b)` — сумма последних цифр двух чисел
```java
- public int lastNumSum(int a, int b){
        return (a % 10) + (b % 10);
    }
```
- Ввод: 72 35 --> Вывод: 7
- Ввод: 12 --> Вывод: 9
- Ввод: 16 --> Вывод: 15
- Ввод: 111 --> Вывод: 6

### 2. Условия
- `double safeDiv(int x, int y)` — безопасное деление (при `y=0` возвращает `0`)
```java
public double safeDiv (int x, int y){
        if(y == 0){
            return 0;
        }else{
            return (double) x /y;
        }
    }
 ```
- Ввод: 6 3 --> Вывод: 2.0
- Ввод: 5 0 --> Вывод: 0


- `String makeDecision(int x, int y)` — сравнение двух чисел (`>`, `<`, `=`)
```java
 public String makeDecision (int x, int y){
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "=" + y;
        }
    }
 ```
- Ввод: 5 7 --> Вывод: 5<7
- Ввод: 9 2 --> Вывод: 9>2
- Ввод: 8 8 --> Вывод: 8=8

- `boolean sum3(int x, int y, int z)` — проверка, можно ли сложением двух чисел получить третье
```java
public boolean sum3 (int x, int y, int z){

        return x + y == z || x + z == y || z + y == x;
    }
 ```
- Ввод: 1 2 3 --> Вывод: true
- Ввод: 3 1 2 --> Вывод: true
- Ввод: 5 3 7 --> Вывод: false

- `String age(int x)` — корректное склонение слова «год/года/лет»
```java
  public String age (int x){
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x+ " год";
        } else if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4)
                && !(lastTwoDigits == 12 || lastTwoDigits == 13 || lastTwoDigits == 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }
 ```
- Ввод: 3 --> Вывод: 3 года
- Ввод: 11 --> Вывод: 11 лет
- Ввод: 32 --> Вывод: 32 года

- `void printDays(String x)` — вывод всех дней недели, начиная с указанного (или сообщение об ошибке)
```java
public void printDays (String x){
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
 ```
- Ввод: четверг --> Вывод: четверг
пятница
суббота
воскресенье
- Ввод: ысифоыв --> Вывод: это не день недели

### 3. Циклы
- `String reverseListNums(int x)` — выводит числа от `x` до `0` в строке
```java
  public String reverseListNums(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            stringBuilder.append(i);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
 ```
- Ввод: 5 --> Вывод: 5 4 3 2 1 0

- `int pow(int x, int y)` — возведение числа в степень
```java
  public int pow (int x, int y){
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
- Ввод: 2 3 --> Вывод: 8
- Ввод: 3 2--> Вывод: 9

- `boolean equalNum(int x)` — проверка, все ли цифры числа одинаковые
```java
public boolean equalNum (int x){
        int lastNum = x%10;
        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastNum) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
 ```
Ввод: 11111 --> Вывод: true
Ввод: 11122 --> Вывод: false

- `void leftTriangle(int x)` — вывод треугольника из символов `*`
```java
public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 ```
- `void guessGame()` — игра «Угадай число» (от 0 до 9)
```java
public void guessGame(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secret = random.nextInt(10);
        int attempts = 0;
        int guess;
        System.out.print("Введите число от 0 до 9: ");

        while (true) {
            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess == secret) {
                    System.out.println("Вы угадали!");
                    System.out.println("Вы отгадали число за " + attempts + " попытки(ок)");
                    break;
                } else {
                    System.out.print("Вы не угадали, введите число от 0 до 9: ");
                }
            }catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
    } 
 ```
### 4. Массивы
- `int findLast(int[] arr, int x)` — поиск индекса последнего вхождения числа в массив
```java
- public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
```
- `int[] add(int[] arr, int x, int pos)` — добавление элемента в массив на позицию
```java
public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
```
- `void reverse(int[] arr)` — переворот массива
```java
public void reverse(int[] arr) {
        int leftNum = 0;
        int rightNum = arr.length - 1;

        while (leftNum < rightNum) {
            int temp = arr[leftNum];
            arr[leftNum] = arr[rightNum];
            arr[rightNum] = temp;

            leftNum++;
            rightNum--;
        }
        System.out.println(Arrays.toString(arr));
    }
```
- `int[] concat(int[] arr1, int[] arr2)` — объединение двух массивов
```java
public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
```
- `int[] deleteNegative(int[] arr)` — удаление отрицательных элементов из массива
```java
public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }
        return result;
    }
```

