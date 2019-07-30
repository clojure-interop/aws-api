(ns com.amazonaws.jmespath.JmesPathIdentity
  "Class definition for identity expression. It represents
  the current node being evaluated"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathIdentity]))

(defn ->jmes-path-identity
  "Constructor."
  (^JmesPathIdentity []
    (new JmesPathIdentity )))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathIdentity) or
   Evaluation visitor(JmesPathIdentity) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathIdentity this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

