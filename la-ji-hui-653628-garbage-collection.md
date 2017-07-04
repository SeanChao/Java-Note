#Java垃圾回收机制(Garbage Collection)
当一个对象没有被引用时，成为垃圾
- 程序员无权调用垃圾回收器
- 程序员可以通过`System.gc()`通知GC运行，但Java规范不能保证立即运行
- `finalize`时Java提供给程序员释放对象或资源的的方法，但是尽量少用