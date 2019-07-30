(ns com.amazonaws.jmespath.JmesPathContainsFunction
  "Implements the contains function that checks if the given
  array or string contains the given element"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathContainsFunction]))

(defn ->jmes-path-contains-function
  "Constructor.

  Constructs a new JmesPathContainsFunction with the given
   list of expressions to be evaluated

  expressions - List of expressions - `java.util.List`"
  (^JmesPathContainsFunction [^java.util.List expressions]
    (new JmesPathContainsFunction expressions)))

(defn evaluate
  "Retrieves the subject(lhs expression) which could be an array
   or string, the search(rhs expression) which could be any JmesPath
   expression. If subject is an array, this function returns true if
   one of the elements in the array is equal to the provided search
   value. If the provided subject is a string, this function returns
   true if the string contains the provided search argument.

  evaluated-args - List of input expressions - `java.util.List`

  returns: True subject contains search;
   False otherwise - `com.fasterxml.jackson.databind.JsonNode`"
  (^com.fasterxml.jackson.databind.JsonNode [^JmesPathContainsFunction this ^java.util.List evaluated-args]
    (-> this (.evaluate evaluated-args))))

