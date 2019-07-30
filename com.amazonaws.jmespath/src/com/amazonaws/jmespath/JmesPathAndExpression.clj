(ns com.amazonaws.jmespath.JmesPathAndExpression
  "Implements logical AND on the given expressions"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathAndExpression]))

(defn ->jmes-path-and-expression
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathAndExpression [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new JmesPathAndExpression lhs-expr rhs-expr)))

(defn get-lhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathAndExpression this]
    (-> this (.getLhsExpr))))

(defn get-rhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathAndExpression this]
    (-> this (.getRhsExpr))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathAndExpression) or
   Evaluation visitor(JmesPathAndExpression) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathAndExpression this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

