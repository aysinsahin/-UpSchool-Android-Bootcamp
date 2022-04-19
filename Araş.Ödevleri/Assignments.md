# UpSchool-Android-Bootcamp
 
# Araştırma Egzersizleri:
 
- [Araştırma Egzersizi 1 - Lateinit](#1)
- [Araştırma Egzersizi 2 - Tools Namespace](#2)
 
 
### Araştırma Egzersizi 1
 
- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?
 
Variable definition processes in Kotlin are done with two different keywords; val: It is used to define a constant value. Once defined, it cannot be changed again. Equivalent to final in Java.
var: Used to define a normal variable. After defining it, you can change its value whenever you want.
lateinit is used only on existing variables. The reason for this is; It should not be defined as final at the bytecode level, because it is defined after, not in the constructor. In other words, if we could define it as final in Kotlin and change its value later, it would not be suitable for the Java language. Because Java would see it as final and wouldn't be able to change it. For this reason, lateinit is always made to be used on non-final variables.
An example :
    lateinit var subject: TestSubject

 
 
 
### Araştırma Egzersizi 2
 
 
- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 
 
