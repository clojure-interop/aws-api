(ns com.amazonaws.jmespath.OpGreaterThan
  "Implements less-than comparison on Numbers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath OpGreaterThan]))

(defn ->op-greater-than
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^OpGreaterThan [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new OpGreaterThan lhs-expr rhs-expr)))

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
  ([^OpGreaterThan this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

(defn matches
  "Checks whether lhs is greater than rhs

  lhs - Lhs number - `java.math.BigDecimal`
  rhs - Rhs number - `java.math.BigDecimal`

  returns: True if lhs is greater than rhs;
   False otherwise - `boolean`"
  (^Boolean [^OpGreaterThan this ^java.math.BigDecimal lhs ^java.math.BigDecimal rhs]
    (-> this (.matches lhs rhs))))

