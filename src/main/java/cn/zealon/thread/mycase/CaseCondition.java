package cn.zealon.thread.mycase;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: Zealon
 * @Date: 2019-01-09 17:09
 */
public class CaseCondition {
    public static void main(String args){
        ReentrantLock reentrantLock=new ReentrantLock();
        Condition condition = reentrantLock.newCondition();

    }
}
