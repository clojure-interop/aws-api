(ns com.amazonaws.jmespath.JmesPathMultiSelectList
  "Class definition for multiselect list expression that is
  used to extract a subset of elements from a JSON hash"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathMultiSelectList]))

(defn ->jmes-path-multi-select-list
  "Constructor.

  expressions - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathMultiSelectList [^com.amazonaws.jmespath.JmesPathExpression expressions]
    (new JmesPathMultiSelectList expressions)))

(defn get-expressions
  "returns: `java.util.List<com.amazonaws.jmespath.JmesPathExpression>`"
  (^java.util.List [^JmesPathMultiSelectList this]
    (-> this (.getExpressions))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathMultiSelectList) or
   Evaluation visitor(JmesPathMultiSelectList) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathMultiSelectList this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

