package cn.xpbootcamp.fizzbuzz;

class FizzBuzz {
    String soundOff(int index) {
        String result = String.valueOf(index);
        if (index % 3 == 0){
            result = "Fizz";
        }
        return result;
    }
}
