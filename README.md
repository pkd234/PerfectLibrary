# PerfectLibrary
Perfect Library is a perfect library for everything that you do on your task.This libray will help you in doing those tasks at a much faster rate

# Prerequisites
Add this in your root build.gradle file (not your module build.gradle file)
```android
allprojects {

	repositories {
  
		...
    
		maven { url "https://jitpack.io" }

	}
  
}
```
# Dependency

```
dependencies {

	        implementation 'com.github.pkd234:PerfectLibrary:1.0'

}

```
# Usage
## Toast Generator
Helps you to genrate various type of toast like success toast ,error toast,info toast with just one method to use toast generator simply call:

```
 ToastGenerator.errorToast(getApplicationContext(),"Some error has occured");
 
 ToastGenerator.successToast(getApplicationContext(),"Yipee task is completed");
 
 ToastGenerator.infoToast(getApplicationContext(),"Plz complete the above form tp continue");
  
```
