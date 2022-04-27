# UpSchool-Android-Bootcamp

# Araştırma Egzersizleri:

- [Araştırma Egzersizi 1 - Lateinit](#1)
- [Araştırma Egzersizi 2 - Tools Namespace](#2)
- Araştırma Ödevi 3 - Font family XML is due
- Araştırma Ödevi 4 - Property Animation is due


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



### Araştırma Egzersizi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Niçin böyle kullanımı tercih ediyoruz ?

Android 8.0 introduces a new feature called Fonts in XML that lets you use fonts as resources. You can add them to the res/font folder to access the fonts as a source. we use @font/myfont or R.font.myfont to access a font resource. to add fonts as resources;
1-)Right-click the res folder and go to New > Android resource directory.
The New Resource Directory window appears.
2-)In the Resource type list, select font, and then click OK.
3-)Add your font files in the font folder.
The folder structure below generates R.font.dancing_script, R.font.lobster, and R.font.typo_graphica.
4-)Double-click a font file to preview the file’s fonts in the editor
In addition, we can create a font family ourselves, apart from creating the source file. On Android, you can create a new font family as an XML resource and access each style and weight as a single unit rather than referencing them as separate resources. By doing this the system can choose the correct font based on the text style you are trying to use.
While creating the font family, we can edit and add the font family both in the design part and in the text part we actually use. we can also call the font family we created from stil.xlm for the textview we want. The purpose of the font family is to use the fonts we want and need wherever we want. Having fonts suitable for every format also benefits us in terms of design.

### Araştırma Egzersizi 4 - Property Animation is due

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız.
- ObjectAnimator
  Animates a specific property of an object over a specific amount of time. Represents an ObjectAnimator.A subclass of ValueAnimator that allows you to set a target object and object property to animate. This class updates the property accordingly when it computes a new value for the animation. You want to use ObjectAnimator most of the time, because it makes the process of animating values on target objects much easier. However, you sometimes want to use ValueAnimator directly because ObjectAnimator has a few more restrictions, such as requiring specific accessor methods to be present on the target object.
- Animator
  This class plays an array of objects out of it. Animations will play together after a certain point.There are two different for one game Animator play to make a series of videos play the same and the same can be played alone or otherwise Can be used in conjunction with AnimatorSet#play(Animator)

