public class ThirdClass {
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        int result = obj.getValue();
        System.out.println("The value is 2nd row 3rd class is: " + result);
    }
}
/*

public class ThirdClass { // "ThirdClass" নামে একটি নতুন ক্লাস (বিভাগ) তৈরি করা হয়েছে।

    public static void main(String[] args) { // "main" মেথড ঘোষণা করা হয়েছে, যা জাভা প্রোগ্রামের প্রবেশদ্বার। এটি প্রোগ্রাম চালু হওয়ার সময় প্রথমে চালু হয়।

        SecondClass obj = new SecondClass();
        // "SecondClass" নামে একটি ক্লাস থেকে "obj" নামে একটি বস্তু (object) তৈরি করা হয়েছে।
        // এর মানে হলো, SecondClass এর কনস্ট্রাক্টর চালু হবে এবং একটি নতুন বস্তু তৈরি হবে।

        int result = obj.getValue();
        // "obj" বস্তু থেকে "getValue" মেথডটি ডাকা হয়েছে এবং তার ফলাফল "result" নামের ইন্টিজার ভেরিয়েবলে রাখা হয়েছে।
        // "getValue" মেথডটি আগে ব্যাখ্যা করা হয়েছে যেখানে এটি ৩য় সারির ৪র্থ কলামের মান (১২) ফেরত দেয়।

        System.out.println("The value in 2nd row 3rd column is: " + result);
        // এটি একটি প্রিন্ট স্টেটমেন্ট যা কনসোলে (screen) টেক্সট এবং "result" এর মান (যা ১২) প্রদর্শন করবে।
    }
}
সহজ ভাষায় ব্যাখ্যা:
ThirdClass নামে একটি ক্লাস তৈরি করা হয়েছে।
main মেথডটি হলো প্রোগ্রামের প্রবেশদ্বার। এটি চালু হওয়ার সাথে সাথে চালু হয়।
SecondClass নামে একটি ক্লাস থেকে একটি নতুন বস্তু obj তৈরি করা হয়েছে।
obj থেকে getValue মেথডটি ডাকা হয়েছে, যা result নামের ভেরিয়েবলে মান (১২) ফিরিয়ে দেয়।
System.out.println দিয়ে "The value in 2nd row 3rd column is: 12" টেক্সটটি কনসোলে প্রদর্শন করা হয়েছে।
আশা করি, তুমি এখন বুঝতে পেরেছো কীভাবে এই কোডটি কাজ করে এবং প্রতিটি লাইনের ভূমিকা কী! যদি আরো কোনো প্রশ্ন থাকে, নির্দ্বিধায় জিজ্ঞাসা করো!









 */