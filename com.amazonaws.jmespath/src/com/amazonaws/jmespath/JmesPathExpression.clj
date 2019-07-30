(ns com.amazonaws.jmespath.JmesPathExpression
  "Interface for accessing JmesPath expression. Different
  types of JmesPath expressions are supported."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathExpression]))

(defn accept
  "Abstract method definition to delegate to either
   the CodeGen visitor or Evaluation visitor based on
   the type of JmesPath visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathExpression this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

