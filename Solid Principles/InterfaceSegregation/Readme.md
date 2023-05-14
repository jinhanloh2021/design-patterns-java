# Interface Segregation Principle

Clients should not depend on interfaces that they do not use. Clients should not depend on methods defined in interfaces they do not use. 
Interface pollution. Should not make interfaces bigger. Should not cram methods into one big interface and make classes implement it.
Problem symptoms is when classes have empty method implementations, method implementations throw UnsupportedOperationExceptions or similar. Methods that return null or default/dummy values.
Don't add too many methods in interfaces.