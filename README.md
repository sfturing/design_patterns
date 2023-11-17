# design_patterns
## Design patterns（设计模式）

### 1. [策略模式](src/main/java/cn/sfturing/patterns/strategy) 。    
    策略模式定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的用户。
  
### 2. [单例模式的双重验证](src/main/java/cn/sfturing/patterns/singleton) 。   



## 常用拓展性实现

### 1. [基于管道(pipeline)](src/main/java/cn/sfturing/pipeline)
管道(Pipeline)----用于串联阀门的管道通路


阀门(PipelineValue)----用于每一个节点处理实际业务诉求


管道上下文(PipelineContext)----用于管道上下文中数据的扭转

当你的数据流需要经过很多同等逻辑处理时，可以考虑使用此套路，便于后续扩展

### 2. [基于责任链(filterchain)](src/main/java/cn/sfturing/filterchain)

过滤器(Filter)----实际处理业务的节点

过滤链(FilterChain)----串联过滤器的链条

### 3. [基于组合/模板的](src/main/java/cn/sfturing/comp)

处理器注册器----用于存储处理器的集合

处理器工厂----用于创建处理器

处理器----实际的处理器以及扩展的实现

处理器上下文----处理器上下文，用于参数的传递

适用场景

适合于有共性、后续持续扩展的场景

### 4. [基于事件分发](src/main/java/cn/sfturing/event)




