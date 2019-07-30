(ns com.amazonaws.services.waf.AbstractAWSWAFRegional
  "Abstract implementation of AWSWAFRegional. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AbstractAWSWAFRegional]))

(defn delete-rule-group
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteRuleGroupRequest`

  returns: Result of the DeleteRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRuleGroupResult`"
  (^com.amazonaws.services.waf.model.DeleteRuleGroupResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRuleGroupRequest request]
    (-> this (.deleteRuleGroup request))))

(defn get-rate-based-rule-managed-keys
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest`

  returns: Result of the GetRateBasedRuleManagedKeys operation returned by the service. - `com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult`"
  (^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest request]
    (-> this (.getRateBasedRuleManagedKeys request))))

(defn list-resources-for-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListResourcesForWebACLRequest`

  returns: Result of the ListResourcesForWebACL operation returned by the service. - `com.amazonaws.services.waf.model.ListResourcesForWebACLResult`"
  (^com.amazonaws.services.waf.model.ListResourcesForWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListResourcesForWebACLRequest request]
    (-> this (.listResourcesForWebACL request))))

(defn get-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRuleRequest`

  returns: Result of the GetRule operation returned by the service. - `com.amazonaws.services.waf.model.GetRuleResult`"
  (^com.amazonaws.services.waf.model.GetRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRuleRequest request]
    (-> this (.getRule request))))

(defn list-tags-for-resource
  "request - `com.amazonaws.services.waf.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.waf.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.waf.model.ListTagsForResourceResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-sql-injection-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to update a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest`

  returns: Result of the UpdateSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult`"
  (^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest request]
    (-> this (.updateSqlInjectionMatchSet request))))

(defn get-logging-configuration
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetLoggingConfigurationRequest`

  returns: Result of the GetLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.GetLoggingConfigurationResult`"
  (^com.amazonaws.services.waf.model.GetLoggingConfigurationResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetLoggingConfigurationRequest request]
    (-> this (.getLoggingConfiguration request))))

(defn set-region
  "Description copied from interface: AWSWAFRegional

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSWAFRegional this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-byte-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteByteMatchSetRequest`

  returns: Result of the DeleteByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteByteMatchSetResult`"
  (^com.amazonaws.services.waf.model.DeleteByteMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteByteMatchSetRequest request]
    (-> this (.deleteByteMatchSet request))))

(defn delete-permission-policy
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeletePermissionPolicyRequest`

  returns: Result of the DeletePermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.DeletePermissionPolicyResult`"
  (^com.amazonaws.services.waf.model.DeletePermissionPolicyResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeletePermissionPolicyRequest request]
    (-> this (.deletePermissionPolicy request))))

(defn create-regex-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateRegexMatchSetRequest`

  returns: Result of the CreateRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateRegexMatchSetResult`"
  (^com.amazonaws.services.waf.model.CreateRegexMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRegexMatchSetRequest request]
    (-> this (.createRegexMatchSet request))))

(defn list-ip-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListIPSetsRequest`

  returns: Result of the ListIPSets operation returned by the service. - `com.amazonaws.services.waf.model.ListIPSetsResult`"
  (^com.amazonaws.services.waf.model.ListIPSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListIPSetsRequest request]
    (-> this (.listIPSets request))))

(defn list-regex-pattern-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListRegexPatternSetsRequest`

  returns: Result of the ListRegexPatternSets operation returned by the service. - `com.amazonaws.services.waf.model.ListRegexPatternSetsResult`"
  (^com.amazonaws.services.waf.model.ListRegexPatternSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListRegexPatternSetsRequest request]
    (-> this (.listRegexPatternSets request))))

(defn delete-regex-pattern-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest`

  returns: Result of the DeleteRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRegexPatternSetResult`"
  (^com.amazonaws.services.waf.model.DeleteRegexPatternSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest request]
    (-> this (.deleteRegexPatternSet request))))

(defn list-web-ac-ls
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListWebACLsRequest`

  returns: Result of the ListWebACLs operation returned by the service. - `com.amazonaws.services.waf.model.ListWebACLsResult`"
  (^com.amazonaws.services.waf.model.ListWebACLsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListWebACLsRequest request]
    (-> this (.listWebACLs request))))

(defn get-regex-pattern-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRegexPatternSetRequest`

  returns: Result of the GetRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.GetRegexPatternSetResult`"
  (^com.amazonaws.services.waf.model.GetRegexPatternSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRegexPatternSetRequest request]
    (-> this (.getRegexPatternSet request))))

(defn update-size-constraint-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest`

  returns: Result of the UpdateSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult`"
  (^com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest request]
    (-> this (.updateSizeConstraintSet request))))

(defn create-sql-injection-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to create a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest`

  returns: Result of the CreateSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult`"
  (^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest request]
    (-> this (.createSqlInjectionMatchSet request))))

(defn delete-sql-injection-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to delete a SqlInjectionMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest`

  returns: Result of the DeleteSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult`"
  (^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest request]
    (-> this (.deleteSqlInjectionMatchSet request))))

(defn disassociate-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DisassociateWebACLRequest`

  returns: Result of the DisassociateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.DisassociateWebACLResult`"
  (^com.amazonaws.services.waf.model.DisassociateWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DisassociateWebACLRequest request]
    (-> this (.disassociateWebACL request))))

(defn get-size-constraint-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetSizeConstraintSetRequest`

  returns: Result of the GetSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.GetSizeConstraintSetResult`"
  (^com.amazonaws.services.waf.model.GetSizeConstraintSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetSizeConstraintSetRequest request]
    (-> this (.getSizeConstraintSet request))))

(defn delete-xss-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to delete an XssMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteXssMatchSetRequest`

  returns: Result of the DeleteXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteXssMatchSetResult`"
  (^com.amazonaws.services.waf.model.DeleteXssMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteXssMatchSetRequest request]
    (-> this (.deleteXssMatchSet request))))

(defn create-geo-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateGeoMatchSetRequest`

  returns: Result of the CreateGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateGeoMatchSetResult`"
  (^com.amazonaws.services.waf.model.CreateGeoMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateGeoMatchSetRequest request]
    (-> this (.createGeoMatchSet request))))

(defn untag-resource
  "request - `com.amazonaws.services.waf.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.waf.model.UntagResourceResult`"
  (^com.amazonaws.services.waf.model.UntagResourceResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn update-ip-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateIPSetRequest`

  returns: Result of the UpdateIPSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateIPSetResult`"
  (^com.amazonaws.services.waf.model.UpdateIPSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateIPSetRequest request]
    (-> this (.updateIPSet request))))

(defn update-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateWebACLRequest`

  returns: Result of the UpdateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.UpdateWebACLResult`"
  (^com.amazonaws.services.waf.model.UpdateWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateWebACLRequest request]
    (-> this (.updateWebACL request))))

(defn update-rule-group
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateRuleGroupRequest`

  returns: Result of the UpdateRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRuleGroupResult`"
  (^com.amazonaws.services.waf.model.UpdateRuleGroupResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRuleGroupRequest request]
    (-> this (.updateRuleGroup request))))

(defn delete-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRuleResult`"
  (^com.amazonaws.services.waf.model.DeleteRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRuleRequest request]
    (-> this (.deleteRule request))))

(defn delete-regex-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest`

  returns: Result of the DeleteRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRegexMatchSetResult`"
  (^com.amazonaws.services.waf.model.DeleteRegexMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest request]
    (-> this (.deleteRegexMatchSet request))))

(defn update-xss-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to update an XssMatchSet. - `com.amazonaws.services.waf.model.UpdateXssMatchSetRequest`

  returns: Result of the UpdateXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateXssMatchSetResult`"
  (^com.amazonaws.services.waf.model.UpdateXssMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateXssMatchSetRequest request]
    (-> this (.updateXssMatchSet request))))

(defn delete-geo-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest`

  returns: Result of the DeleteGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteGeoMatchSetResult`"
  (^com.amazonaws.services.waf.model.DeleteGeoMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest request]
    (-> this (.deleteGeoMatchSet request))))

(defn update-regex-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest`

  returns: Result of the UpdateRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRegexMatchSetResult`"
  (^com.amazonaws.services.waf.model.UpdateRegexMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest request]
    (-> this (.updateRegexMatchSet request))))

(defn get-rule-group
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRuleGroupRequest`

  returns: Result of the GetRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.GetRuleGroupResult`"
  (^com.amazonaws.services.waf.model.GetRuleGroupResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRuleGroupRequest request]
    (-> this (.getRuleGroup request))))

(defn get-web-acl-for-resource
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetWebACLForResourceRequest`

  returns: Result of the GetWebACLForResource operation returned by the service. - `com.amazonaws.services.waf.model.GetWebACLForResourceResult`"
  (^com.amazonaws.services.waf.model.GetWebACLForResourceResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetWebACLForResourceRequest request]
    (-> this (.getWebACLForResource request))))

(defn create-rule-group
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateRuleGroupRequest`

  returns: Result of the CreateRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.CreateRuleGroupResult`"
  (^com.amazonaws.services.waf.model.CreateRuleGroupResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRuleGroupRequest request]
    (-> this (.createRuleGroup request))))

(defn get-change-token-status
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetChangeTokenStatusRequest`

  returns: Result of the GetChangeTokenStatus operation returned by the service. - `com.amazonaws.services.waf.model.GetChangeTokenStatusResult`"
  (^com.amazonaws.services.waf.model.GetChangeTokenStatusResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetChangeTokenStatusRequest request]
    (-> this (.getChangeTokenStatus request))))

(defn get-regex-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRegexMatchSetRequest`

  returns: Result of the GetRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetRegexMatchSetResult`"
  (^com.amazonaws.services.waf.model.GetRegexMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRegexMatchSetRequest request]
    (-> this (.getRegexMatchSet request))))

(defn create-byte-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateByteMatchSetRequest`

  returns: Result of the CreateByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateByteMatchSetResult`"
  (^com.amazonaws.services.waf.model.CreateByteMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateByteMatchSetRequest request]
    (-> this (.createByteMatchSet request))))

(defn list-size-constraint-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest`

  returns: Result of the ListSizeConstraintSets operation returned by the service. - `com.amazonaws.services.waf.model.ListSizeConstraintSetsResult`"
  (^com.amazonaws.services.waf.model.ListSizeConstraintSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest request]
    (-> this (.listSizeConstraintSets request))))

(defn shutdown
  "Description copied from interface: AWSWAFRegional"
  ([^AbstractAWSWAFRegional this]
    (-> this (.shutdown))))

(defn update-byte-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateByteMatchSetRequest`

  returns: Result of the UpdateByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateByteMatchSetResult`"
  (^com.amazonaws.services.waf.model.UpdateByteMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateByteMatchSetRequest request]
    (-> this (.updateByteMatchSet request))))

(defn list-geo-match-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListGeoMatchSetsRequest`

  returns: Result of the ListGeoMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListGeoMatchSetsResult`"
  (^com.amazonaws.services.waf.model.ListGeoMatchSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListGeoMatchSetsRequest request]
    (-> this (.listGeoMatchSets request))))

(defn get-change-token
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetChangeTokenRequest`

  returns: Result of the GetChangeToken operation returned by the service. - `com.amazonaws.services.waf.model.GetChangeTokenResult`"
  (^com.amazonaws.services.waf.model.GetChangeTokenResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetChangeTokenRequest request]
    (-> this (.getChangeToken request))))

(defn delete-size-constraint-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest`

  returns: Result of the DeleteSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult`"
  (^com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest request]
    (-> this (.deleteSizeConstraintSet request))))

(defn get-sql-injection-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to get a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest`

  returns: Result of the GetSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult`"
  (^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest request]
    (-> this (.getSqlInjectionMatchSet request))))

(defn list-subscribed-rule-groups
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest`

  returns: Result of the ListSubscribedRuleGroups operation returned by the service. - `com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult`"
  (^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest request]
    (-> this (.listSubscribedRuleGroups request))))

(defn list-rule-groups
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListRuleGroupsRequest`

  returns: Result of the ListRuleGroups operation returned by the service. - `com.amazonaws.services.waf.model.ListRuleGroupsResult`"
  (^com.amazonaws.services.waf.model.ListRuleGroupsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListRuleGroupsRequest request]
    (-> this (.listRuleGroups request))))

(defn create-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateRuleRequest`

  returns: Result of the CreateRule operation returned by the service. - `com.amazonaws.services.waf.model.CreateRuleResult`"
  (^com.amazonaws.services.waf.model.CreateRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRuleRequest request]
    (-> this (.createRule request))))

(defn get-xss-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to get an XssMatchSet. - `com.amazonaws.services.waf.model.GetXssMatchSetRequest`

  returns: Result of the GetXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetXssMatchSetResult`"
  (^com.amazonaws.services.waf.model.GetXssMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetXssMatchSetRequest request]
    (-> this (.getXssMatchSet request))))

(defn set-endpoint
  "Description copied from interface: AWSWAFRegional

  endpoint - The endpoint (ex: \"waf-regional.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://waf-regional.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSWAFRegional this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateRuleRequest`

  returns: Result of the UpdateRule operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRuleResult`"
  (^com.amazonaws.services.waf.model.UpdateRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRuleRequest request]
    (-> this (.updateRule request))))

(defn delete-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteWebACLRequest`

  returns: Result of the DeleteWebACL operation returned by the service. - `com.amazonaws.services.waf.model.DeleteWebACLResult`"
  (^com.amazonaws.services.waf.model.DeleteWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteWebACLRequest request]
    (-> this (.deleteWebACL request))))

(defn update-regex-pattern-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest`

  returns: Result of the UpdateRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRegexPatternSetResult`"
  (^com.amazonaws.services.waf.model.UpdateRegexPatternSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest request]
    (-> this (.updateRegexPatternSet request))))

(defn list-rate-based-rules
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListRateBasedRulesRequest`

  returns: Result of the ListRateBasedRules operation returned by the service. - `com.amazonaws.services.waf.model.ListRateBasedRulesResult`"
  (^com.amazonaws.services.waf.model.ListRateBasedRulesResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListRateBasedRulesRequest request]
    (-> this (.listRateBasedRules request))))

(defn update-rate-based-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest`

  returns: Result of the UpdateRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRateBasedRuleResult`"
  (^com.amazonaws.services.waf.model.UpdateRateBasedRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest request]
    (-> this (.updateRateBasedRule request))))

(defn put-permission-policy
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.PutPermissionPolicyRequest`

  returns: Result of the PutPermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.PutPermissionPolicyResult`"
  (^com.amazonaws.services.waf.model.PutPermissionPolicyResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.PutPermissionPolicyRequest request]
    (-> this (.putPermissionPolicy request))))

(defn delete-rate-based-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest`

  returns: Result of the DeleteRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRateBasedRuleResult`"
  (^com.amazonaws.services.waf.model.DeleteRateBasedRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest request]
    (-> this (.deleteRateBasedRule request))))

(defn list-sql-injection-match-sets
  "Description copied from interface: AWSWAFRegional

  request - A request to list the SqlInjectionMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest`

  returns: Result of the ListSqlInjectionMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult`"
  (^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest request]
    (-> this (.listSqlInjectionMatchSets request))))

(defn get-geo-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetGeoMatchSetRequest`

  returns: Result of the GetGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetGeoMatchSetResult`"
  (^com.amazonaws.services.waf.model.GetGeoMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetGeoMatchSetRequest request]
    (-> this (.getGeoMatchSet request))))

(defn get-ip-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetIPSetRequest`

  returns: Result of the GetIPSet operation returned by the service. - `com.amazonaws.services.waf.model.GetIPSetResult`"
  (^com.amazonaws.services.waf.model.GetIPSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetIPSetRequest request]
    (-> this (.getIPSet request))))

(defn get-rate-based-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetRateBasedRuleRequest`

  returns: Result of the GetRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.GetRateBasedRuleResult`"
  (^com.amazonaws.services.waf.model.GetRateBasedRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetRateBasedRuleRequest request]
    (-> this (.getRateBasedRule request))))

(defn put-logging-configuration
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.PutLoggingConfigurationRequest`

  returns: Result of the PutLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.PutLoggingConfigurationResult`"
  (^com.amazonaws.services.waf.model.PutLoggingConfigurationResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.PutLoggingConfigurationRequest request]
    (-> this (.putLoggingConfiguration request))))

(defn list-activated-rules-in-rule-group
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest`

  returns: Result of the ListActivatedRulesInRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult`"
  (^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest request]
    (-> this (.listActivatedRulesInRuleGroup request))))

(defn associate-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.AssociateWebACLRequest`

  returns: Result of the AssociateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.AssociateWebACLResult`"
  (^com.amazonaws.services.waf.model.AssociateWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.AssociateWebACLRequest request]
    (-> this (.associateWebACL request))))

(defn delete-logging-configuration
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest`

  returns: Result of the DeleteLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.DeleteLoggingConfigurationResult`"
  (^com.amazonaws.services.waf.model.DeleteLoggingConfigurationResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest request]
    (-> this (.deleteLoggingConfiguration request))))

(defn list-byte-match-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListByteMatchSetsRequest`

  returns: Result of the ListByteMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListByteMatchSetsResult`"
  (^com.amazonaws.services.waf.model.ListByteMatchSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListByteMatchSetsRequest request]
    (-> this (.listByteMatchSets request))))

(defn get-sampled-requests
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetSampledRequestsRequest`

  returns: Result of the GetSampledRequests operation returned by the service. - `com.amazonaws.services.waf.model.GetSampledRequestsResult`"
  (^com.amazonaws.services.waf.model.GetSampledRequestsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetSampledRequestsRequest request]
    (-> this (.getSampledRequests request))))

(defn list-xss-match-sets
  "Description copied from interface: AWSWAFRegional

  request - A request to list the XssMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListXssMatchSetsRequest`

  returns: Result of the ListXssMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListXssMatchSetsResult`"
  (^com.amazonaws.services.waf.model.ListXssMatchSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListXssMatchSetsRequest request]
    (-> this (.listXssMatchSets request))))

(defn list-regex-match-sets
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListRegexMatchSetsRequest`

  returns: Result of the ListRegexMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListRegexMatchSetsResult`"
  (^com.amazonaws.services.waf.model.ListRegexMatchSetsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListRegexMatchSetsRequest request]
    (-> this (.listRegexMatchSets request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSWAFRegional

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSWAFRegional this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetWebACLRequest`

  returns: Result of the GetWebACL operation returned by the service. - `com.amazonaws.services.waf.model.GetWebACLResult`"
  (^com.amazonaws.services.waf.model.GetWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetWebACLRequest request]
    (-> this (.getWebACL request))))

(defn get-permission-policy
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetPermissionPolicyRequest`

  returns: Result of the GetPermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.GetPermissionPolicyResult`"
  (^com.amazonaws.services.waf.model.GetPermissionPolicyResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetPermissionPolicyRequest request]
    (-> this (.getPermissionPolicy request))))

(defn create-xss-match-set
  "Description copied from interface: AWSWAFRegional

  request - A request to create an XssMatchSet. - `com.amazonaws.services.waf.model.CreateXssMatchSetRequest`

  returns: Result of the CreateXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateXssMatchSetResult`"
  (^com.amazonaws.services.waf.model.CreateXssMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateXssMatchSetRequest request]
    (-> this (.createXssMatchSet request))))

(defn create-regex-pattern-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateRegexPatternSetRequest`

  returns: Result of the CreateRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateRegexPatternSetResult`"
  (^com.amazonaws.services.waf.model.CreateRegexPatternSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRegexPatternSetRequest request]
    (-> this (.createRegexPatternSet request))))

(defn list-rules
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListRulesRequest`

  returns: Result of the ListRules operation returned by the service. - `com.amazonaws.services.waf.model.ListRulesResult`"
  (^com.amazonaws.services.waf.model.ListRulesResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListRulesRequest request]
    (-> this (.listRules request))))

(defn create-ip-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateIPSetRequest`

  returns: Result of the CreateIPSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateIPSetResult`"
  (^com.amazonaws.services.waf.model.CreateIPSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateIPSetRequest request]
    (-> this (.createIPSet request))))

(defn tag-resource
  "request - `com.amazonaws.services.waf.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.waf.model.TagResourceResult`"
  (^com.amazonaws.services.waf.model.TagResourceResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-size-constraint-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest`

  returns: Result of the CreateSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateSizeConstraintSetResult`"
  (^com.amazonaws.services.waf.model.CreateSizeConstraintSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest request]
    (-> this (.createSizeConstraintSet request))))

(defn update-geo-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest`

  returns: Result of the UpdateGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateGeoMatchSetResult`"
  (^com.amazonaws.services.waf.model.UpdateGeoMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest request]
    (-> this (.updateGeoMatchSet request))))

(defn list-logging-configurations
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest`

  returns: Result of the ListLoggingConfigurations operation returned by the service. - `com.amazonaws.services.waf.model.ListLoggingConfigurationsResult`"
  (^com.amazonaws.services.waf.model.ListLoggingConfigurationsResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest request]
    (-> this (.listLoggingConfigurations request))))

(defn create-web-acl
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateWebACLRequest`

  returns: Result of the CreateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.CreateWebACLResult`"
  (^com.amazonaws.services.waf.model.CreateWebACLResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateWebACLRequest request]
    (-> this (.createWebACL request))))

(defn get-byte-match-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.GetByteMatchSetRequest`

  returns: Result of the GetByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetByteMatchSetResult`"
  (^com.amazonaws.services.waf.model.GetByteMatchSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.GetByteMatchSetRequest request]
    (-> this (.getByteMatchSet request))))

(defn delete-ip-set
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.DeleteIPSetRequest`

  returns: Result of the DeleteIPSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteIPSetResult`"
  (^com.amazonaws.services.waf.model.DeleteIPSetResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteIPSetRequest request]
    (-> this (.deleteIPSet request))))

(defn create-rate-based-rule
  "Description copied from interface: AWSWAFRegional

  request - `com.amazonaws.services.waf.model.CreateRateBasedRuleRequest`

  returns: Result of the CreateRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.CreateRateBasedRuleResult`"
  (^com.amazonaws.services.waf.model.CreateRateBasedRuleResult [^AbstractAWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRateBasedRuleRequest request]
    (-> this (.createRateBasedRule request))))

