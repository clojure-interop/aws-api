(ns com.amazonaws.jmespath.OpLessThan
  "Implements less-than comparison on Numbers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath OpLessThan]))

(defn ->op-less-than
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^OpLessThan [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new OpLessThan lhs-expr rhs-expr)))

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
  ([^OpLessThan this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

(defn matches
  "Checks whether lhs is less than rhs

  lhs - Lhs number - `java.math.BigDecimal`
  rhs - Rhs number - `java.math.BigDecimal`

  returns: True if lhs is less than rhs;
   False otherwise - `boolean`"
  (^Boolean [^OpLessThan this ^java.math.BigDecimal lhs ^java.math.BigDecimal rhs]
    (-> this (.matches lhs rhs))))

