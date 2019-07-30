(ns com.amazonaws.services.waf.AbstractAWSWAFRegionalAsync
  "Abstract implementation of AWSWAFRegionalAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AbstractAWSWAFRegionalAsync]))

(defn untag-resource-async
  "request - `com.amazonaws.services.waf.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-rule-group-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateRuleGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRuleGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateRuleGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRuleGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRuleGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRuleGroupRequest request]
    (-> this (.updateRuleGroupAsync request))))

(defn update-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateWebACLRequest request]
    (-> this (.updateWebACLAsync request))))

(defn get-regex-pattern-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRegexPatternSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegexPatternSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRegexPatternSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRegexPatternSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegexPatternSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRegexPatternSetRequest request]
    (-> this (.getRegexPatternSetAsync request))))

(defn get-regex-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRegexMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegexMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRegexMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRegexMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegexMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRegexMatchSetRequest request]
    (-> this (.getRegexMatchSetAsync request))))

(defn get-change-token-status-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetChangeTokenStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChangeTokenStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetChangeTokenStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetChangeTokenStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChangeTokenStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetChangeTokenStatusRequest request]
    (-> this (.getChangeTokenStatusAsync request))))

(defn list-byte-match-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListByteMatchSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListByteMatchSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListByteMatchSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListByteMatchSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listByteMatchSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListByteMatchSetsRequest request]
    (-> this (.listByteMatchSetsAsync request))))

(defn delete-rate-based-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRateBasedRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteRateBasedRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRateBasedRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest request]
    (-> this (.deleteRateBasedRuleAsync request))))

(defn list-regex-match-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListRegexMatchSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRegexMatchSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListRegexMatchSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRegexMatchSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRegexMatchSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRegexMatchSetsRequest request]
    (-> this (.listRegexMatchSetsAsync request))))

(defn create-geo-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateGeoMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGeoMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateGeoMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateGeoMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGeoMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateGeoMatchSetRequest request]
    (-> this (.createGeoMatchSetAsync request))))

(defn delete-regex-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRegexMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteRegexMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRegexMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest request]
    (-> this (.deleteRegexMatchSetAsync request))))

(defn get-logging-configuration-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetLoggingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetLoggingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetLoggingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetLoggingConfigurationRequest request]
    (-> this (.getLoggingConfigurationAsync request))))

(defn list-resources-for-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListResourcesForWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourcesForWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListResourcesForWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListResourcesForWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesForWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListResourcesForWebACLRequest request]
    (-> this (.listResourcesForWebACLAsync request))))

(defn get-permission-policy-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetPermissionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPermissionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetPermissionPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetPermissionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPermissionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetPermissionPolicyRequest request]
    (-> this (.getPermissionPolicyAsync request))))

(defn delete-permission-policy-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeletePermissionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePermissionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeletePermissionPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeletePermissionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePermissionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeletePermissionPolicyRequest request]
    (-> this (.deletePermissionPolicyAsync request))))

(defn create-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRuleRequest request]
    (-> this (.createRuleAsync request))))

(defn delete-size-constraint-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSizeConstraintSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSizeConstraintSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest request]
    (-> this (.deleteSizeConstraintSetAsync request))))

(defn list-rate-based-rules-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListRateBasedRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRateBasedRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListRateBasedRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRateBasedRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRateBasedRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRateBasedRulesRequest request]
    (-> this (.listRateBasedRulesAsync request))))

(defn delete-byte-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteByteMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteByteMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteByteMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteByteMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteByteMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteByteMatchSetRequest request]
    (-> this (.deleteByteMatchSetAsync request))))

(defn put-logging-configuration-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.PutLoggingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLoggingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.PutLoggingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.PutLoggingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLoggingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.PutLoggingConfigurationRequest request]
    (-> this (.putLoggingConfigurationAsync request))))

(defn update-byte-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateByteMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateByteMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateByteMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateByteMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateByteMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateByteMatchSetRequest request]
    (-> this (.updateByteMatchSetAsync request))))

(defn create-rate-based-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateRateBasedRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRateBasedRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateRateBasedRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRateBasedRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRateBasedRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRateBasedRuleRequest request]
    (-> this (.createRateBasedRuleAsync request))))

(defn create-byte-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateByteMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateByteMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateByteMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateByteMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createByteMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateByteMatchSetRequest request]
    (-> this (.createByteMatchSetAsync request))))

(defn get-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetWebACLRequest request]
    (-> this (.getWebACLAsync request))))

(defn create-sql-injection-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to create a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSqlInjectionMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSqlInjectionMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest request]
    (-> this (.createSqlInjectionMatchSetAsync request))))

(defn create-xss-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to create an XssMatchSet. - `com.amazonaws.services.waf.model.CreateXssMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateXssMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateXssMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateXssMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createXssMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateXssMatchSetRequest request]
    (-> this (.createXssMatchSetAsync request))))

(defn create-rule-group-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateRuleGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRuleGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateRuleGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRuleGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRuleGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRuleGroupRequest request]
    (-> this (.createRuleGroupAsync request))))

(defn get-byte-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetByteMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetByteMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetByteMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetByteMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getByteMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetByteMatchSetRequest request]
    (-> this (.getByteMatchSetAsync request))))

(defn delete-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRuleRequest request]
    (-> this (.deleteRuleAsync request))))

(defn create-ip-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateIPSetRequest request]
    (-> this (.createIPSetAsync request))))

(defn create-regex-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateRegexMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRegexMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateRegexMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRegexMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRegexMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRegexMatchSetRequest request]
    (-> this (.createRegexMatchSetAsync request))))

(defn disassociate-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DisassociateWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DisassociateWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DisassociateWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DisassociateWebACLRequest request]
    (-> this (.disassociateWebACLAsync request))))

(defn get-ip-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetIPSetRequest request]
    (-> this (.getIPSetAsync request))))

(defn delete-geo-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGeoMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteGeoMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGeoMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest request]
    (-> this (.deleteGeoMatchSetAsync request))))

(defn put-permission-policy-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.PutPermissionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPermissionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.PutPermissionPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.PutPermissionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPermissionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.PutPermissionPolicyRequest request]
    (-> this (.putPermissionPolicyAsync request))))

(defn update-rate-based-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRateBasedRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateRateBasedRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRateBasedRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest request]
    (-> this (.updateRateBasedRuleAsync request))))

(defn list-activated-rules-in-rule-group-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActivatedRulesInRuleGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActivatedRulesInRuleGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest request]
    (-> this (.listActivatedRulesInRuleGroupAsync request))))

(defn delete-sql-injection-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to delete a SqlInjectionMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSqlInjectionMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSqlInjectionMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest request]
    (-> this (.deleteSqlInjectionMatchSetAsync request))))

(defn get-size-constraint-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetSizeConstraintSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSizeConstraintSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetSizeConstraintSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSizeConstraintSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSizeConstraintSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSizeConstraintSetRequest request]
    (-> this (.getSizeConstraintSetAsync request))))

(defn get-web-acl-for-resource-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetWebACLForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWebACLForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetWebACLForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetWebACLForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWebACLForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetWebACLForResourceRequest request]
    (-> this (.getWebACLForResourceAsync request))))

(defn update-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRuleRequest request]
    (-> this (.updateRuleAsync request))))

(defn create-regex-pattern-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateRegexPatternSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRegexPatternSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateRegexPatternSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRegexPatternSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRegexPatternSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateRegexPatternSetRequest request]
    (-> this (.createRegexPatternSetAsync request))))

(defn delete-xss-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to delete an XssMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteXssMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteXssMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteXssMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteXssMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteXssMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteXssMatchSetRequest request]
    (-> this (.deleteXssMatchSetAsync request))))

(defn list-ip-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListIPSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIPSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListIPSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListIPSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIPSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListIPSetsRequest request]
    (-> this (.listIPSetsAsync request))))

(defn list-geo-match-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListGeoMatchSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGeoMatchSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListGeoMatchSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListGeoMatchSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGeoMatchSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListGeoMatchSetsRequest request]
    (-> this (.listGeoMatchSetsAsync request))))

(defn get-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRuleRequest request]
    (-> this (.getRuleAsync request))))

(defn list-rule-groups-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListRuleGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuleGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListRuleGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRuleGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRuleGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRuleGroupsRequest request]
    (-> this (.listRuleGroupsAsync request))))

(defn update-sql-injection-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to update a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSqlInjectionMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSqlInjectionMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest request]
    (-> this (.updateSqlInjectionMatchSetAsync request))))

(defn get-change-token-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetChangeTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetChangeToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetChangeTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetChangeTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getChangeTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetChangeTokenRequest request]
    (-> this (.getChangeTokenAsync request))))

(defn get-rate-based-rule-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRateBasedRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRateBasedRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRateBasedRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRateBasedRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRateBasedRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRateBasedRuleRequest request]
    (-> this (.getRateBasedRuleAsync request))))

(defn get-sampled-requests-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetSampledRequestsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSampledRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetSampledRequestsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSampledRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSampledRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSampledRequestsRequest request]
    (-> this (.getSampledRequestsAsync request))))

(defn list-regex-pattern-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListRegexPatternSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRegexPatternSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListRegexPatternSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRegexPatternSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRegexPatternSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRegexPatternSetsRequest request]
    (-> this (.listRegexPatternSetsAsync request))))

(defn list-tags-for-resource-async
  "request - `com.amazonaws.services.waf.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-regex-pattern-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteRegexPatternSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRegexPatternSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest request]
    (-> this (.deleteRegexPatternSetAsync request))))

(defn delete-ip-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteIPSetRequest request]
    (-> this (.deleteIPSetAsync request))))

(defn list-size-constraint-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSizeConstraintSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListSizeConstraintSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSizeConstraintSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest request]
    (-> this (.listSizeConstraintSetsAsync request))))

(defn get-xss-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to get an XssMatchSet. - `com.amazonaws.services.waf.model.GetXssMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetXssMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetXssMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetXssMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getXssMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetXssMatchSetRequest request]
    (-> this (.getXssMatchSetAsync request))))

(defn update-regex-pattern-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateRegexPatternSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRegexPatternSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest request]
    (-> this (.updateRegexPatternSetAsync request))))

(defn list-sql-injection-match-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to list the SqlInjectionMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSqlInjectionMatchSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSqlInjectionMatchSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest request]
    (-> this (.listSqlInjectionMatchSetsAsync request))))

(defn delete-logging-configuration-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteLoggingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoggingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest request]
    (-> this (.deleteLoggingConfigurationAsync request))))

(defn get-rule-group-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRuleGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRuleGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRuleGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRuleGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRuleGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRuleGroupRequest request]
    (-> this (.getRuleGroupAsync request))))

(defn update-ip-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateIPSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIPSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateIPSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateIPSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIPSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateIPSetRequest request]
    (-> this (.updateIPSetAsync request))))

(defn update-size-constraint-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSizeConstraintSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSizeConstraintSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest request]
    (-> this (.updateSizeConstraintSetAsync request))))

(defn associate-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.AssociateWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.AssociateWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.AssociateWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.AssociateWebACLRequest request]
    (-> this (.associateWebACLAsync request))))

(defn update-regex-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRegexMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateRegexMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRegexMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest request]
    (-> this (.updateRegexMatchSetAsync request))))

(defn delete-rule-group-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteRuleGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRuleGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteRuleGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRuleGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteRuleGroupRequest request]
    (-> this (.deleteRuleGroupAsync request))))

(defn list-subscribed-rule-groups-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscribedRuleGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscribedRuleGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest request]
    (-> this (.listSubscribedRuleGroupsAsync request))))

(defn get-sql-injection-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to get a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSqlInjectionMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSqlInjectionMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest request]
    (-> this (.getSqlInjectionMatchSetAsync request))))

(defn create-size-constraint-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSizeConstraintSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateSizeConstraintSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSizeConstraintSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest request]
    (-> this (.createSizeConstraintSetAsync request))))

(defn list-rules-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListRulesRequest request]
    (-> this (.listRulesAsync request))))

(defn update-xss-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to update an XssMatchSet. - `com.amazonaws.services.waf.model.UpdateXssMatchSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateXssMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateXssMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateXssMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateXssMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateXssMatchSetRequest request]
    (-> this (.updateXssMatchSetAsync request))))

(defn get-rate-based-rule-managed-keys-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRateBasedRuleManagedKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRateBasedRuleManagedKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest request]
    (-> this (.getRateBasedRuleManagedKeysAsync request))))

(defn list-xss-match-sets-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - A request to list the XssMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListXssMatchSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListXssMatchSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListXssMatchSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListXssMatchSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listXssMatchSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListXssMatchSetsRequest request]
    (-> this (.listXssMatchSetsAsync request))))

(defn delete-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.DeleteWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.DeleteWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.DeleteWebACLRequest request]
    (-> this (.deleteWebACLAsync request))))

(defn update-geo-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGeoMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.UpdateGeoMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGeoMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest request]
    (-> this (.updateGeoMatchSetAsync request))))

(defn tag-resource-async
  "request - `com.amazonaws.services.waf.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-web-ac-ls-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListWebACLsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebACLs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListWebACLsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListWebACLsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebACLsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListWebACLsRequest request]
    (-> this (.listWebACLsAsync request))))

(defn create-web-acl-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.CreateWebACLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebACL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.CreateWebACLResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateWebACLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebACLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.CreateWebACLRequest request]
    (-> this (.createWebACLAsync request))))

(defn list-logging-configurations-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLoggingConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.ListLoggingConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLoggingConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest request]
    (-> this (.listLoggingConfigurationsAsync request))))

(defn get-geo-match-set-async
  "Description copied from interface: AWSWAFRegionalAsync

  request - `com.amazonaws.services.waf.model.GetGeoMatchSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGeoMatchSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.waf.model.GetGeoMatchSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetGeoMatchSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGeoMatchSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSWAFRegionalAsync this ^com.amazonaws.services.waf.model.GetGeoMatchSetRequest request]
    (-> this (.getGeoMatchSetAsync request))))

