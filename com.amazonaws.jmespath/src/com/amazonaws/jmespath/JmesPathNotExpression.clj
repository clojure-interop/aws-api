(ns com.amazonaws.jmespath.JmesPathNotExpression
  "Implements logical NOT on the given expression"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathNotExpression]))

(defn ->jmes-path-not-expression
  "Constructor.

  expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathNotExpression [^com.amazonaws.jmespath.JmesPathExpression expr]
    (new JmesPathNotExpression expr)))

(defn get-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathNotExpression this]
    (-> this (.getExpr))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathNotExpression) or
   Evaluation visitor(JmesPathNotExpression) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathNotExpression this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

