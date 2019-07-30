(ns com.amazonaws.jmespath.JmesPathFlatten
  "Class definition for flatten expression. It will merge
  sub-lists in the current result into a single list."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathFlatten]))

(defn ->jmes-path-flatten
  "Constructor.

  to-flatten - `com.amazonaws.jmespath.JmesPathExpression`"
  (^JmesPathFlatten [^com.amazonaws.jmespath.JmesPathExpression to-flatten]
    (new JmesPathFlatten to-flatten)))

(defn get-flatten-expr
  "returns: `com.amazonaws.jmespath.JmesPathExpression`"
  (^com.amazonaws.jmespath.JmesPathExpression [^JmesPathFlatten this]
    (-> this (.getFlattenExpr))))

(defn accept
  "Delegates to either the CodeGen visitor(JmesPathFlatten) or
   Evaluation visitor(JmesPathFlatten) based on the type of JmesPath
   visitor

  visitor - CodeGen visitor or Evaluation visitor - `com.amazonaws.jmespath.JmesPathVisitor`
  input - Input expression that needs to be evaluated - `Input`

  returns: Corresponding output is returned. Evaluated String
   in the case of CodeGen visitor or an evaluated JsonNode
   in the case of Evaluation visitor - `<Input,Output> Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathFlatten this ^com.amazonaws.jmespath.JmesPathVisitor visitor input]
    (-> this (.accept visitor input))))

