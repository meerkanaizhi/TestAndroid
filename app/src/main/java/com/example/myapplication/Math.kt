package com.example.myapplication

class Math {
    fun add(a: String, b: String): String {
        var result = ""
        if (a.contains(".")|| b.contains(".")){
            result = (a.toDouble()+ b.toDouble()).toString()

        }else if(!isInteger(a) || !isInteger(b)){
            result ="symbols cannot be use"

        }else{
            result= (a.toInt() + b.toInt()).toString()
        }
        return result

    }
    fun divide(a: String, b: String): String{
        var result = ""
        if (b == "0"){
            result= "cannot be divided by 0"
        }else {
            result = (a.toInt() / b.toInt()).toString()
        }
        return  result



    }
    fun isInteger(str: String?) = str?.toIntOrNull()?.let { true }?: false
}


