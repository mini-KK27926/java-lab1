package ru.university.lab1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String TASK_NUMBER = "Задача ";
        int counterForTasks = 0;
        int firstIntForScanner;
        int secondIntForScanner;
        int thirdIntForScanner;
        char charForScanner;
        String stringForScanner;
        int[] arr;
        MethodsConsitionsCyclesArray methodsConsitionsCyclesArray = new MethodsConsitionsCyclesArray();

        System.out.println("Задание 1. Методы");
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите целое двузначное (или более) число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                if (firstIntForScanner < 10) {
                    System.out.println("Ошибка. Введите двузначное (или более) число.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат суммы двух последних цифр: " + methodsConsitionsCyclesArray.sumLastNums(firstIntForScanner));
        System.out.println("Задание 1. Методы");
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.isPositive(firstIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            try {
                System.out.println("Введите одну букву : ");
                String input = scanner.next();

                if (input.length() != 1) {
                    throw new InputMismatchException("Ошибка. Пожалуйста, введите ровно одну букву");
                }
                charForScanner = input.charAt(0);
                if (!Character.isLetter(charForScanner)) {
                    throw new InputMismatchException();
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите букву");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.isUpperCase(charForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                System.out.println("Введите второе целое число: ");
                secondIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.isDivisor(firstIntForScanner, secondIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                for (int i = 0; i < 4; i++) {
                    System.out.println("Введите следующее целое число: ");
                    secondIntForScanner = scanner.nextInt();
                    int temporaryVar = methodsConsitionsCyclesArray.lastNumSum(firstIntForScanner, secondIntForScanner);
                    System.out.println(firstIntForScanner + "+" + secondIntForScanner + " это " + temporaryVar);
                    firstIntForScanner = temporaryVar;
                }
                System.out.println("Итого: " + firstIntForScanner);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Задание 2. Условия");
        System.out.println(TASK_NUMBER + (counterForTasks = 2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                System.out.println("Введите второе целое число: ");
                secondIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.safeDiv(firstIntForScanner, secondIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                System.out.println("Введите второе целое число: ");
                secondIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.makeDecision(firstIntForScanner, secondIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                System.out.println("Введите второе целое число: ");
                secondIntForScanner = scanner.nextInt();
                System.out.println("Введите третье целое число: ");
                thirdIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }

        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.sum3(firstIntForScanner,secondIntForScanner,thirdIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));

        while (true) {
            System.out.println("Введите целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.age(firstIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        scanner.nextLine();
        while (true) {
            System.out.println("Введите день недели: ");
            stringForScanner = scanner.nextLine();

            if (!stringForScanner.isBlank()) {
                break;
            } else {
                System.out.println("Ошибка. Пожалуйста, введите непустую строку");
            }
        }
        System.out.println("Результат: ");
        methodsConsitionsCyclesArray.printDays(stringForScanner);

        while (true) {
            System.out.println("Введите целое число : ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.reverseListNums(firstIntForScanner));
        System.out.println("Задание 3. Циклы");
        System.out.println(TASK_NUMBER + (counterForTasks = 2));

        while (true) {
            System.out.println("Введите целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.reverseListNums(firstIntForScanner));

        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            System.out.println("Введите первое целое число: ");
            try {
                firstIntForScanner = scanner.nextInt();
                System.out.println("Введите второе целое число: ");
                secondIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + methodsConsitionsCyclesArray.pow(firstIntForScanner,secondIntForScanner));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));

        while (true) {
            System.out.println("Введите целое число : ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        methodsConsitionsCyclesArray.equalNum(firstIntForScanner);

        while (true) {
            System.out.println("Введите целое число : ");
            try {
                firstIntForScanner = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: ");
        methodsConsitionsCyclesArray.leftTriangle(firstIntForScanner);
        System.out.println(TASK_NUMBER + (counterForTasks+=2));

        methodsConsitionsCyclesArray.guessGame();
        System.out.println("Задание 4. Массивы");
        System.out.println(TASK_NUMBER + (counterForTasks+=2));

        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                firstIntForScanner = scanner.nextInt();

                arr = new int[firstIntForScanner];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < firstIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    arr[i] = scanner.nextInt();
                }

                System.out.print("Введите число для поиска: ");
                secondIntForScanner = scanner.nextInt();

                int result = methodsConsitionsCyclesArray.findLast(arr, secondIntForScanner);

                if (result != -1) {
                    System.out.println("Последнее вхождение числа " + secondIntForScanner + " имеет индекс: " + result);
                    break;
                } else {
                    System.out.println("Число " + secondIntForScanner + " не найдено в массиве.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }

        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                firstIntForScanner = scanner.nextInt();

                arr = new int[firstIntForScanner];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < firstIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    arr[i] = scanner.nextInt();
                }
                System.out.println("Введите значение, которое будет добавлено в массив: ");
                secondIntForScanner = scanner.nextInt();
                System.out.println("Введите номер позиции в массиве: ");
                thirdIntForScanner = scanner.nextInt();
                if (thirdIntForScanner < 0 || thirdIntForScanner > arr.length){
                    System.out.println("Ошибка. Номер позиции в массиве должен быть больше 0 и не превышать длины массива");
                }else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println(Arrays.toString(methodsConsitionsCyclesArray.add(arr, secondIntForScanner, thirdIntForScanner)));
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                firstIntForScanner = scanner.nextInt();
                arr = new int[firstIntForScanner];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < firstIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    arr[i] = scanner.nextInt();
                }
                methodsConsitionsCyclesArray.reverse(arr);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            try {
                System.out.print("Введите размер первого массива: ");
                firstIntForScanner = scanner.nextInt();
                int[] firstArr = new int[firstIntForScanner];
                System.out.println("Введите элементы первого массива");
                for (int i = 0; i < firstIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    firstArr[i] = scanner.nextInt();
                }
                System.out.print("Введите размер второго массива");
                secondIntForScanner = scanner.nextInt();
                int[] secondArr = new int[secondIntForScanner];
                System.out.println("Введите элементы второго массива");
                for (int i = 0; i < secondIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    secondArr[i] = scanner.nextInt();
                }
                System.out.println(Arrays.toString(methodsConsitionsCyclesArray.concat(firstArr,secondArr)));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
        System.out.println(TASK_NUMBER + (counterForTasks+=2));
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                firstIntForScanner = scanner.nextInt();
                arr = new int[firstIntForScanner];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < firstIntForScanner; i++) {
                    System.out.print("Элемент " + i + ": ");
                    arr[i] = scanner.nextInt();
                }
                methodsConsitionsCyclesArray.deleteNegative(arr);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.nextLine();
            }
        }
    }
}

