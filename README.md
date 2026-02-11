| Category | Pattern | What it does | Use it when… |
|---|---|---|---|
| Creational | Factory Method | Lets subclasses decide which class to instantiate | You need a creation “hook” so the framework/library code can create app-specific objects without knowing concrete types |
| Creational | Abstract Factory | Creates *families* of related objects consistently | You must ensure compatible product combinations (e.g., Windows UI widgets vs macOS widgets) |
| Creational | Builder | Builds complex objects step-by-step | Object construction has many optional parts/variants and you want readable, safe construction |
| Creational | Prototype | Clones objects instead of instantiating new ones | Creating an object is expensive or you need many similar objects based on a template |
| Creational | Singleton | Ensures exactly one instance with global access | You truly need a single shared instance (e.g., process-wide registry); use sparingly due to testability/coupling |
| Structural | Adapter | Converts one interface to another | You must use an existing class but its interface doesn’t match what your code expects |
| Structural | Bridge | Separates abstraction from implementation | You have two independent dimensions of variation (e.g., shape × renderer) and want to avoid class explosion |
| Structural | Composite | Treats part-whole hierarchies uniformly | You want to handle individual objects and groups of objects the same way (trees, UI, file systems) |
| Structural | Decorator | Adds behavior dynamically by wrapping | You need flexible feature combinations without subclassing (e.g., streams, middleware chains) |
| Structural | Facade | Provides a simplified interface to a subsystem | You want an easy API over a complex set of classes or you want to reduce coupling to subsystem details |
| Structural | Flyweight | Shares common state to save memory | You have massive numbers of similar objects and memory/creation cost is a problem |
| Structural | Proxy | Controls access to another object | You need lazy loading, access control, caching, remote access, or logging around a real object |
| Behavioral | Chain of Responsibility | Passes requests along handlers | Multiple objects could handle a request and you want to decouple sender from receiver (pipelines, filters) |
| Behavioral | Command | Encapsulates a request as an object | You need undo/redo, queueing, scheduling, logging, or parameterizing actions |
| Behavioral | Interpreter | Defines grammar + interpreter for a language | You need to evaluate simple domain-specific expressions (rare; often replaced by parsers/libs) |
| Behavioral | Iterator | Traverses a collection without exposing internals | You want a standard way to iterate while hiding underlying structure |
| Behavioral | Mediator | Centralizes complex communications | Many objects interact in tangled ways and you want to reduce direct dependencies (UI dialogs, orchestration) |
| Behavioral | Memento | Captures and restores object state | You need snapshots for undo/rollback without exposing internal representation |
| Behavioral | Observer | Notifies dependents on state changes | One-to-many updates are needed (events, reactive UI); consider backpressure/threading concerns |
| Behavioral | State | Changes behavior based on internal state | An object has state-dependent behavior and big conditional logic is getting unwieldy |
| Behavioral | Strategy | Swaps algorithms behind a common interface | You need interchangeable behaviors (sorting, pricing rules, auth methods) chosen at runtime |
| Behavioral | Template Method | Defines algorithm skeleton; subclasses fill steps | You have a stable process with variable steps and want to avoid duplicating the overall flow |
| Behavioral | Visitor | Adds operations to object structures without changing them | You need many operations over a stable object structure (ASTs) and want to keep operations separate from data types |
