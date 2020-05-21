package cn.xpbootcamp.fizzbuzz;

class FizzBuzz {
    String soundOff(int index) {
        String result = "";
        if (index % 3 == 0){
            result += "Fizz";
        }
        if (index % 5 == 0){
            result += "Buzz";
        }
        if (index % 7 == 0){
            result = "Whizz";
        }
        return result.equals("") ? String.valueOf(index) : result;
    }
}
