/**
 *
 * 线程间的协作
 *
 * 当多个线程可以一起工作去解决某个问题时，如果某些部分必须在其它部分之前完成，那么就需要对线程进行协调。
 * 主要有以下方法：
 * 1、join
 *    在线程中调用另一个线程的 join() 方法，会将当前线程挂起，而不是忙等待，直到目标线程结束。
 *
 * 2、wait() notify() notifyAll()
 *    调用 wait() 使得线程等待某个条件满足，线程在等待时会被挂起，当其他线程的运行使得这个条件满足时，
 *    其它线程会调用 notify() 或者 notifyAll() 来唤醒挂起的线程。
 *
 * 3、await() signal() signalAll()
 *    java.util.concurrent 类库中提供了 Condition 类来实现线程之间的协调，可以在 Condition 上调用
 *    await() 方法使线程等待，其它线程调用 signal() 或 signalAll() 方法唤醒等待的线程。
 *    相比于 wait() 这种等待方式，await() 可以指定等待的条件，因此更加灵活。
 *
 * @auther: Zealon
 * @Date: 2018-06-21 20:01
 */
package cn.zealon.thread.cooperate;