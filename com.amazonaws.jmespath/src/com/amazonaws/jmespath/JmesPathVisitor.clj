(ns com.amazonaws.jmespath.JmesPathVisitor
  "Visitor interface for delegating the Jmespath expression to its
  corresponding type for evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathVisitor]))

(defn visit
  "sub-expression - `com.amazonaws.jmespath.JmesPathSubExpression`
  input - `Input`

  returns: `Output`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  ([^JmesPathVisitor this ^com.amazonaws.jmespath.JmesPathSubExpression sub-expression input]
    (-> this (.visit sub-expression input))))

