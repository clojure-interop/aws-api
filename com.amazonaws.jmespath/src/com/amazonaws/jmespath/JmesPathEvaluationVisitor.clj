(ns com.amazonaws.jmespath.JmesPathEvaluationVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmespath JmesPathEvaluationVisitor]))

(defn ->jmes-path-evaluation-visitor
  "Constructor."
  (^JmesPathEvaluationVisitor []
    (new JmesPathEvaluationVisitor )))

(defn visit
  "Evaluates a subexpression by evaluating the expression on
   the left with the original JSON document and then evaluating
   the expression on the right with the result of the left
   expression evaluation.

  sub-expression - JmesPath subexpression type - `com.amazonaws.jmespath.JmesPathSubExpression`
  input - Input json node against which evaluation is done - `com.fasterxml.jackson.databind.JsonNode`

  returns: Result of the subexpression evaluation - `com.fasterxml.jackson.databind.JsonNode`

  throws: com.amazonaws.jmespath.InvalidTypeException"
  (^com.fasterxml.jackson.databind.JsonNode [^JmesPathEvaluationVisitor this ^com.amazonaws.jmespath.JmesPathSubExpression sub-expression ^com.fasterxml.jackson.databind.JsonNode input]
    (-> this (.visit sub-expression input))))

