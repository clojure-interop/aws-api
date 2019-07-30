(ns com.amazonaws.jmespath.JmesPathFunction
  "Abstract class definition for function expressions that are
  used to transform and filter data in powerful ways."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathFunction]))

(defn ->jmes-path-function
  "Constructor.

  expressions - `java.util.List`"
  (^JmesPathFunction [^java.util.List expressions]
    (new JmesPathFunction expressions)))

(defn get-expressions
  "returns: `java.util.List<com.amazonaws.jmespath.JmesPathExpression>`"
  (^java.util.List [^JmesPathFunction this]
    (-> this (.getExpressions))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathFunction) or
   Evaluation visitor(JmesPathFunction) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathFunction this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

(defn evaluate
  "Abstract method definition for evaluating the given list of
   expressions as per the given type of function

  evaluated-args - List of expressions to be evaluated - `java.util.List`

  returns: Result of the evaluation of the
   corresponding function - `com.fasterxml.jackson.databind.JsonNode`"
  (^com.fasterxml.jackson.databind.JsonNode [^JmesPathFunction this ^java.util.List evaluated-args]
    (-> this (.evaluate evaluated-args))))

