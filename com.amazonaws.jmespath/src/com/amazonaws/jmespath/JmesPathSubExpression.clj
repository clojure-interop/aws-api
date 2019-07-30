(ns com.amazonaws.jmespath.JmesPathSubExpression
  "Class definition for JmesPath subexpression that is a
  combination of two or more expressions"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathSubExpression]))

(defn ->jmes-path-sub-expression
  "Constructor.

  expressions - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathSubExpression [^com.amazonaws.jmespath.JmesPathExpression expressions]
    (new JmesPathSubExpression expressions)))

(defn get-expressions
  "returns: `java.util.List<com.amazonaws.jmespath.JmesPathExpression>`"
  (^java.util.List [^JmesPathSubExpression this]
    (-> this (.getExpressions))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathSubExpression) or
   Evaluation visitor(JmesPathSubExpression) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathSubExpression this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

