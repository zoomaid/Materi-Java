# Pengenalan Java

## Compiled Programming Language
Java merupakan compiled language, yang berarti source code Java tidak dapat dijalankan sebelum di
compile. Fungsi compile adalah merubah code menjadi Java byte yang nantinya akan dijalankan oleh
runtime. Perintah untuk mengcompile java code adalah:

```
# javac file_name.java
javac Zooma.java
```

hasil kompilasi berupa java byte code (file dengan ekstensi .class) yang di generate secara otomatis
oleh compiler.

Secara sederhana compiler mentranslasikan code java menjadi bahasa yang dimengerti oleh mesin.

## Runtime: Java Virtual Machine
Runtime merupakan Java feature untuk menjalankan java byte code hasil compilasi oleh compiler.
Program java dapat dijalankan pada berbagai macam device tanpa harus merubah code dikarenakan adanya
runtime ini. Runtime berfungsi layaknya virtual machine. Untuk menjalankan java byte code (file dengan ekstensi .class) adalah dengan perintah

```
# java file_name (tanpa ekstensi apapun)
java Zooma
```

## Static Type
Java merupakan bahasa yang static type, yang berarti setiap variable dan method yang dideklarasikan
harus ditentukan tipenya.