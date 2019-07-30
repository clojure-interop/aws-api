(ns com.amazonaws.jmespath.JmesPathFilter
  "Class definition for filter expression that provides a way
  to select JSON elements based on a comparison to another
  expression."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathFilter]))

(defn ->jmes-path-filter
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  comparator - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathFilter [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr ^com.amazonaws.jmespath.JmesPathExpression comparator]
    (new JmesPathFilter lhs-expr rhs-expr comparator)))

(defn get-rhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathFilter this]
    (-> this (.getRhsExpr))))

(defn get-lhs-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathFilter this]
    (-> this (.getLhsExpr))))

(defn get-comparator
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathFilter this]
    (-> this (.getComparator))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathFilter) or
   Evaluation visitor(JmesPathFilter) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathFilter this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

