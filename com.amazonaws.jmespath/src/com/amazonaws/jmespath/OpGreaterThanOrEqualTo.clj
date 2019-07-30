(ns com.amazonaws.jmespath.OpGreaterThanOrEqualTo
  "Implements less-than-or-equal-to comparison on Numbers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath OpGreaterThanOrEqualTo]))

(defn ->op-greater-than-or-equal-to
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^OpGreaterThanOrEqualTo [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new OpGreaterThanOrEqualTo lhs-expr rhs-expr)))

(defn accept
  "Delegates to either the CodeGen visitor(Comparator) or
   Evaluation visitor(Comparator) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^OpGreaterThanOrEqualTo this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

(defn matches
  "Checks whether lhs is greater than or equal to rhs

  lhs - Lhs number - `java.math.BigDecimal`
  rhs - Rhs number - `java.math.BigDecimal`

  returns: True if lhs is greater than or equal to rhs;
   False otherwise - `boolean`"
  (^Boolean [^OpGreaterThanOrEqualTo this ^java.math.BigDecimal lhs ^java.math.BigDecimal rhs]
    (-> this (.matches lhs rhs))))

