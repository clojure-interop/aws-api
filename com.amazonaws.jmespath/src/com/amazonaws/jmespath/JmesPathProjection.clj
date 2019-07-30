(ns com.amazonaws.jmespath.JmesPathProjection
  "Class definition for projection expression that allows
  you to apply an expression to a collection of elements.
  Implements list projection."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathProjection]))

(defn ->jmes-path-projection
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  projection-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathProjection [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression projection-expr]
    (new JmesPathProjection lhs-expr projection-expr)))

(defn get-lhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathProjection this]
    (-> this (.getLhsExpr))))

(defn get-projection-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathProjection this]
    (-> this (.getProjectionExpr))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathProjection) or
   Evaluation visitor(JmesPathProjection) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathProjection this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

