(ns com.amazonaws.jmespath.JmesPathLengthFunction
  "Class definition for length function that determines
  the length of the given argument"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathLengthFunction]))

(defn ->jmes-path-length-function
  "Constructor.

  Constructs a new JmesPathContainsFunction with the given
   list of arguments to be evaluated

  arguments - List of arguments - `java.util.List`"
  (^JmesPathLengthFunction [^java.util.List arguments]
    (new JmesPathLengthFunction arguments)))

(defn evaluate
  "Evaluates the length of the given argument.

  evaluated-args - List of expressions to be evaluated. Can be a string, array or object - `java.util.List`

  returns: Length of the argument - `com.fasterxml.jackson.databind.JsonNode`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  (^com.fasterxml.jackson.databind.JsonNode [^JmesPathLengthFunction this ^java.util.List evaluated-args]
    (-> this (.evaluate evaluated-args))))

