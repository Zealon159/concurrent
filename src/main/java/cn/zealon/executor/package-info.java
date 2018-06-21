/**
 *
 * 线程池使用
 * Executor 管理多个异步任务的执行，而无需程序员显式地管理线程的生命周期。
 * 这里的异步是指多个任务的执行互不干扰，不需要进行同步操作。
 *
 * 常用的三种：
 * （1）CachedThreadPool：一个任务创建一个线程；
 * （2）FixedThreadPool：所有任务只能使用固定大小的线程；
 * （3）SingleThreadExecutor：相当于大小为 1 的 FixedThreadPool。
 *
 *  另外，也可以自定义创建 ThreadPoolExecutor 实例对象来更灵活的创建线程池。
 *
 * @auther: Zealon
 * @Date: 2018-06-21 17:07
 */
package cn.zealon.executor;