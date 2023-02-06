package service;

import service.fizzBuzz.FizzBuzz;




public class GameService {

    public Object[] play(){
        int arraySize = 10;
        Object[] result = new Object[arraySize];
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 0; i < arraySize; i++){
            result[i] = fizzBuzz.playWithNumber(i+1);
        }
        return result;
    }
}
