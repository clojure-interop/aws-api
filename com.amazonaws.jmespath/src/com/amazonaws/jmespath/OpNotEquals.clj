(ns com.amazonaws.jmespath.OpNotEquals
  "Implements not-equal-to comparison on different expressions"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath OpNotEquals]))

(defn ->op-not-equals
  "Constructor.

  lhs-expr - `com.amazonaws.jmespath.JmesPathExpression`
  rhs-expr - `com.amazonaws.jmespath.JmesPathExpression`"
  (^OpNotEquals [^com.amazonaws.jmespath.JmesPathExpression lhs-expr ^com.amazonaws.jmespath.JmesPathExpression rhs-expr]
    (new OpNotEquals lhs-expr rhs-expr)))

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
  ([^OpNotEquals this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

(defn matches
  "Checks whether lhs is not equal to rhs

  lhs - Lhs expression - `com.fasterxml.jackson.databind.JsonNode`
  rhs - Rhs expression - `com.fasterxml.jackson.databind.JsonNode`

  returns: True if lhs is not equal to rhs;
   False otherwise - `boolean`"
  (^Boolean [^OpNotEquals this ^com.fasterxml.jackson.databind.JsonNode lhs ^com.fasterxml.jackson.databind.JsonNode rhs]
    (-> this (.matches lhs rhs))))

