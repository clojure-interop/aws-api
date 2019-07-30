(ns com.amazonaws.jmespath.JmesPathLiteral
  "Class definition for literal expression that represents
  the arbitrary JSON objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathLiteral]))

(defn ->jmes-path-literal
  "Constructor.

  value - `java.lang.String`"
  (^JmesPathLiteral [^java.lang.String value]
    (new JmesPathLiteral value)))

(defn get-value
  "returns: `com.fasterxml.jackson.databind.JsonNode`"
  (^com.fasterxml.jackson.databind.JsonNode [^JmesPathLiteral this]
    (-> this (.getValue))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathLiteral) or
   Evaluation visitor(JmesPathLiteral) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathLiteral this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

