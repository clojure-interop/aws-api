(ns com.amazonaws.jmespath.JmesPathField
  "Class definition for a single field in a JmesPath expression
  Example : { \"a\": { \"b\": \"c\"}}
  Expression : a.b
  Fields : a , b"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathField]))

(defn ->jmes-path-field
  "Constructor.

  value - `java.lang.String`"
  (^JmesPathField [^java.lang.String value]
    (new JmesPathField value)))

(defn get-value
  "returns: `java.lang.String`"
  (^java.lang.String [^JmesPathField this]
    (-> this (.getValue))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathField) or
   Evaluation visitor(JmesPathField) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathField this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

