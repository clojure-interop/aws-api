(ns com.amazonaws.jmespath.JmesPathValueProjection
  "Class definition for value(object) projection that
  allows you to apply an expression over a JSON object"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathValueProjection]))

(defn ->jmes-path-value-projection
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathValueProjection [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new JmesPathValueProjection lhs-expr rhs-expr)))

(defn get-lhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathValueProjection this]
    (-> this (.getLhsExpr))))

(defn get-rhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathValueProjection this]
    (-> this (.getRhsExpr))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathValueProjection) or
   Evaluation visitor(JmesPathValueProjection) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathValueProjection this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

