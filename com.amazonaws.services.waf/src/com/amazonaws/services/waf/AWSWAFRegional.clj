(ns com.amazonaws.services.waf.AWSWAFRegional
  "Interface for accessing WAF Regional.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSWAFRegional instead.



  This is the AWS WAF Regional API Reference for using AWS WAF with Elastic Load Balancing (ELB) Application
  Load Balancers. The AWS WAF actions and data types listed in the reference are available for protecting Application
  Load Balancers. You can use these actions and data types by means of the endpoints listed in AWS Regions and Endpoints. This guide
  is for developers who need detailed information about the AWS WAF API actions, data types, and errors. For detailed
  information about AWS WAF features and an overview of how to use the AWS WAF API, see the AWS WAF Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AWSWAFRegional]))

(defn delete-rule-group
  "Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any
   WebACL objects or if it still includes any rules.


   If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL.


   To permanently delete a RuleGroup from AWS WAF, perform the following steps:




   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteRuleGroup request.




   Submit a DeleteRuleGroup request.

  delete-rule-group-request - `com.amazonaws.services.waf.model.DeleteRuleGroupRequest`

  returns: Result of the DeleteRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRuleGroupResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteRuleGroupResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRuleGroupRequest delete-rule-group-request]
    (-> this (.deleteRuleGroup delete-rule-group-request))))

(defn get-rate-based-rule-managed-keys
  "Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the
   RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
   addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.

  get-rate-based-rule-managed-keys-request - `com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest`

  returns: Result of the GetRateBasedRuleManagedKeys operation returned by the service. - `com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest get-rate-based-rule-managed-keys-request]
    (-> this (.getRateBasedRuleManagedKeys get-rate-based-rule-managed-keys-request))))

(defn list-resources-for-web-acl
  "Returns an array of resources associated with the specified web ACL.

  list-resources-for-web-acl-request - `com.amazonaws.services.waf.model.ListResourcesForWebACLRequest`

  returns: Result of the ListResourcesForWebACL operation returned by the service. - `com.amazonaws.services.waf.model.ListResourcesForWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListResourcesForWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListResourcesForWebACLRequest list-resources-for-web-acl-request]
    (-> this (.listResourcesForWebACL list-resources-for-web-acl-request))))

(defn get-rule
  "Returns the Rule that is specified by the RuleId that you included in the
   GetRule request.

  get-rule-request - `com.amazonaws.services.waf.model.GetRuleRequest`

  returns: Result of the GetRule operation returned by the service. - `com.amazonaws.services.waf.model.GetRuleResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRuleRequest get-rule-request]
    (-> this (.getRule get-rule-request))))

(defn list-tags-for-resource
  "list-tags-for-resource-request - `com.amazonaws.services.waf.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.waf.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListTagsForResourceResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn update-sql-injection-match-set
  "Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each
   SqlInjectionMatchTuple object, you specify the following values:




   Action: Whether to insert the object into or delete the object from the array. To change a
   SqlInjectionMatchTuple, you delete the existing object and add a new one.




   FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
   inspect a header or custom query parameter, the name of the header or parameter.




   TextTransformation: Which text transformation, if any, to perform on the web request before
   inspecting the request for snippets of malicious SQL code.


   You can only specify a single type of TextTransformation.




   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow,
   block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string
   and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable
   settings, and then configure AWS WAF to block the requests.


   To create and configure a SqlInjectionMatchSet, perform the following steps:




   Submit a CreateSqlInjectionMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateIPSet request.




   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS
   WAF to inspect for snippets of SQL code.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-sql-injection-match-set-request - A request to update a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest`

  returns: Result of the UpdateSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest update-sql-injection-match-set-request]
    (-> this (.updateSqlInjectionMatchSet update-sql-injection-match-set-request))))

(defn get-logging-configuration
  "Returns the LoggingConfiguration for the specified web ACL.

  get-logging-configuration-request - `com.amazonaws.services.waf.model.GetLoggingConfigurationRequest`

  returns: Result of the GetLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.GetLoggingConfigurationResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetLoggingConfigurationResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetLoggingConfigurationRequest get-logging-configuration-request]
    (-> this (.getLoggingConfiguration get-logging-configuration-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSWAFRegional this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-byte-match-set
  "Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any
   Rules or if it still includes any ByteMatchTuple objects (any filters).


   If you just want to remove a ByteMatchSet from a Rule, use UpdateRule.


   To permanently delete a ByteMatchSet, perform the following steps:




   Update the ByteMatchSet to remove filters, if any. For more information, see
   UpdateByteMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteByteMatchSet request.




   Submit a DeleteByteMatchSet request.

  delete-byte-match-set-request - `com.amazonaws.services.waf.model.DeleteByteMatchSetRequest`

  returns: Result of the DeleteByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteByteMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteByteMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteByteMatchSetRequest delete-byte-match-set-request]
    (-> this (.deleteByteMatchSet delete-byte-match-set-request))))

(defn delete-permission-policy
  "Permanently deletes an IAM policy from the specified RuleGroup.


   The user making the request must be the owner of the RuleGroup.

  delete-permission-policy-request - `com.amazonaws.services.waf.model.DeletePermissionPolicyRequest`

  returns: Result of the DeletePermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.DeletePermissionPolicyResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeletePermissionPolicyResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeletePermissionPolicyRequest delete-permission-policy-request]
    (-> this (.deletePermissionPolicy delete-permission-policy-request))))

(defn create-regex-match-set
  "Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request
   that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string.
   For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks
   for any requests with User-Agent headers that match a RegexPatternSet with pattern
   B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests.


   To create and configure a RegexMatchSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateRegexMatchSet request.




   Submit a CreateRegexMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRegexMatchSet request.




   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect
   (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF
   to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-regex-match-set-request - `com.amazonaws.services.waf.model.CreateRegexMatchSetRequest`

  returns: Result of the CreateRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateRegexMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateRegexMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRegexMatchSetRequest create-regex-match-set-request]
    (-> this (.createRegexMatchSet create-regex-match-set-request))))

(defn list-ip-sets
  "Returns an array of IPSetSummary objects in the response.

  list-ip-sets-request - `com.amazonaws.services.waf.model.ListIPSetsRequest`

  returns: Result of the ListIPSets operation returned by the service. - `com.amazonaws.services.waf.model.ListIPSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListIPSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListIPSetsRequest list-ip-sets-request]
    (-> this (.listIPSets list-ip-sets-request))))

(defn list-regex-pattern-sets
  "Returns an array of RegexPatternSetSummary objects.

  list-regex-pattern-sets-request - `com.amazonaws.services.waf.model.ListRegexPatternSetsRequest`

  returns: Result of the ListRegexPatternSets operation returned by the service. - `com.amazonaws.services.waf.model.ListRegexPatternSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListRegexPatternSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListRegexPatternSetsRequest list-regex-pattern-sets-request]
    (-> this (.listRegexPatternSets list-regex-pattern-sets-request))))

(defn delete-regex-pattern-set
  "Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used
   in any RegexMatchSet or if the RegexPatternSet is not empty.

  delete-regex-pattern-set-request - `com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest`

  returns: Result of the DeleteRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRegexPatternSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteRegexPatternSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest delete-regex-pattern-set-request]
    (-> this (.deleteRegexPatternSet delete-regex-pattern-set-request))))

(defn list-web-ac-ls
  "Returns an array of WebACLSummary objects in the response.

  list-web-ac-ls-request - `com.amazonaws.services.waf.model.ListWebACLsRequest`

  returns: Result of the ListWebACLs operation returned by the service. - `com.amazonaws.services.waf.model.ListWebACLsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListWebACLsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListWebACLsRequest list-web-ac-ls-request]
    (-> this (.listWebACLs list-web-ac-ls-request))))

(defn get-regex-pattern-set
  "Returns the RegexPatternSet specified by RegexPatternSetId.

  get-regex-pattern-set-request - `com.amazonaws.services.waf.model.GetRegexPatternSetRequest`

  returns: Result of the GetRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.GetRegexPatternSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRegexPatternSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRegexPatternSetRequest get-regex-pattern-set-request]
    (-> this (.getRegexPatternSet get-regex-pattern-set-request))))

(defn update-size-constraint-set
  "Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each
   SizeConstraint object, you specify the following values:




   Whether to insert or delete the object from the array. If you want to change a
   SizeConstraintSetUpdate object, you delete the existing object and add a new one.




   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length
   of the User-Agent header.




   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its
   length. Note that transformations of the request body are not supported because the AWS resource forwards only
   the first 8192 bytes of your request to AWS WAF.


   You can only specify a single type of TextTransformation.




   A ComparisonOperator used for evaluating the selected part of the request against the specified
   Size, such as equals, greater than, less than, and so on.




   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed
   after applying the transformation.




   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the
   length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block
   those requests.


   To create and configure a SizeConstraintSet, perform the following steps:




   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateSizeConstraintSet request.




   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF
   to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-size-constraint-set-request - `com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest`

  returns: Result of the UpdateSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest update-size-constraint-set-request]
    (-> this (.updateSizeConstraintSet update-size-constraint-set-request))))

(defn create-sql-injection-match-set
  "Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of
   SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be
   malicious strings.


   To create and configure a SqlInjectionMatchSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateSqlInjectionMatchSet request.




   Submit a CreateSqlInjectionMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateSqlInjectionMatchSet request.




   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to
   allow, block, or count malicious SQL code.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-sql-injection-match-set-request - A request to create a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest`

  returns: Result of the CreateSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFDisallowedNameException - The name specified is invalid."
  (^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest create-sql-injection-match-set-request]
    (-> this (.createSqlInjectionMatchSet create-sql-injection-match-set-request))))

(defn delete-sql-injection-match-set
  "Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's
   still used in any Rules or if it still contains any SqlInjectionMatchTuple objects.


   If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule.


   To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:




   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see
   UpdateSqlInjectionMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteSqlInjectionMatchSet request.




   Submit a DeleteSqlInjectionMatchSet request.

  delete-sql-injection-match-set-request - A request to delete a SqlInjectionMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest`

  returns: Result of the DeleteSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest delete-sql-injection-match-set-request]
    (-> this (.deleteSqlInjectionMatchSet delete-sql-injection-match-set-request))))

(defn disassociate-web-acl
  "Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.

  disassociate-web-acl-request - `com.amazonaws.services.waf.model.DisassociateWebACLRequest`

  returns: Result of the DisassociateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.DisassociateWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DisassociateWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DisassociateWebACLRequest disassociate-web-acl-request]
    (-> this (.disassociateWebACL disassociate-web-acl-request))))

(defn get-size-constraint-set
  "Returns the SizeConstraintSet specified by SizeConstraintSetId.

  get-size-constraint-set-request - `com.amazonaws.services.waf.model.GetSizeConstraintSetRequest`

  returns: Result of the GetSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.GetSizeConstraintSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetSizeConstraintSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetSizeConstraintSetRequest get-size-constraint-set-request]
    (-> this (.getSizeConstraintSet get-size-constraint-set-request))))

(defn delete-xss-match-set
  "Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any
   Rules or if it still contains any XssMatchTuple objects.


   If you just want to remove an XssMatchSet from a Rule, use UpdateRule.


   To permanently delete an XssMatchSet from AWS WAF, perform the following steps:




   Update the XssMatchSet to remove filters, if any. For more information, see
   UpdateXssMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteXssMatchSet request.




   Submit a DeleteXssMatchSet request.

  delete-xss-match-set-request - A request to delete an XssMatchSet from AWS WAF. - `com.amazonaws.services.waf.model.DeleteXssMatchSetRequest`

  returns: Result of the DeleteXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteXssMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteXssMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteXssMatchSetRequest delete-xss-match-set-request]
    (-> this (.deleteXssMatchSet delete-xss-match-set-request))))

(defn create-geo-match-set
  "Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on
   the country that the requests originate from. For example, if you're receiving a lot of requests from one or more
   countries and you want to block the requests, you can create an GeoMatchSet that contains those
   countries and then configure AWS WAF to block the requests.


   To create and configure a GeoMatchSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateGeoMatchSet request.




   Submit a CreateGeoMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateGeoMatchSet request.




   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-geo-match-set-request - `com.amazonaws.services.waf.model.CreateGeoMatchSetRequest`

  returns: Result of the CreateGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateGeoMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateGeoMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateGeoMatchSetRequest create-geo-match-set-request]
    (-> this (.createGeoMatchSet create-geo-match-set-request))))

(defn untag-resource
  "untag-resource-request - `com.amazonaws.services.waf.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.waf.model.UntagResourceResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.UntagResourceResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn update-ip-set
  "Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor
   object, you specify the following values:




   Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor
   object, you delete the existing object and add a new one.




   The IP address version, IPv4 or IPv6.




   The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from
   192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address
   192.0.2.44).




   AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address
   ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.


   IPv6 addresses can be represented using any of the following formats:




   1111:0000:0000:0000:0000:0000:0000:0111/128




   1111:0:0:0:0:0:0:0111/128




   1111::0111/128




   1111::111/128




   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses
   that the requests originated from. For example, if you're receiving a lot of requests from one or a small number
   of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP
   addresses, and then configure AWS WAF to block the requests.


   To create and configure an IPSet, perform the following steps:




   Submit a CreateIPSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateIPSet request.




   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.




   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses
   that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new
   one.


   You can insert a maximum of 1000 addresses in a single request.


   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-ip-set-request - `com.amazonaws.services.waf.model.UpdateIPSetRequest`

  returns: Result of the UpdateIPSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateIPSetResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateIPSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateIPSetRequest update-ip-set-request]
    (-> this (.updateIPSet update-ip-set-request))))

(defn update-web-acl
  "Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web
   requests that you want to allow, block, or count. When you update a WebACL, you specify the
   following values:




   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs
   the default action if a request doesn't match the criteria in any of the Rules in a
   WebACL.




   The Rules that you want to add or delete. If you want to replace one Rule with another,
   you delete the existing Rule and add the new one.




   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that
   match the conditions in the Rule.




   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more
   than one Rule to a WebACL, AWS WAF evaluates each request against the
   Rules in order based on the value of Priority. (The Rule that has the
   lowest value for Priority is evaluated first.) When a web request matches all the predicates (such
   as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the
   corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules
   in the WebACL, if any.




   To create and configure a WebACL, perform the following steps:




   Create and update the predicates that you want to include in Rules. For more information, see
   CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet,
   CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.




   Create and update the Rules that you want to include in the WebACL. For more
   information, see CreateRule and UpdateRule.




   Create a WebACL. See CreateWebACL.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateWebACL request.




   Submit an UpdateWebACL request to specify the Rules that you want to include in the
   WebACL, to specify the default action, and to associate the WebACL with a CloudFront
   distribution.


   The ActivatedRule can be a rule group. If you specify a rule group as your
   ActivatedRule, you can exclude specific rules from that rule group.


   If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL
   request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the
   re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.




   Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating
   the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default
   rule type) with the specified ID, which does not exist.


   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-web-acl-request - `com.amazonaws.services.waf.model.UpdateWebACLRequest`

  returns: Result of the UpdateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.UpdateWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateWebACLRequest update-web-acl-request]
    (-> this (.updateWebACL update-web-acl-request))))

(defn update-rule-group
  "Inserts or deletes ActivatedRule objects in a RuleGroup.


   You can only insert REGULAR rules into a rule group.


   You can have a maximum of ten rules per rule group.


   To create and configure a RuleGroup, perform the following steps:




   Create and update the Rules that you want to include in the RuleGroup. See
   CreateRule.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRuleGroup request.




   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.




   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.




   If you want to replace one Rule with another, you delete the existing one and add the new one.


   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-rule-group-request - `com.amazonaws.services.waf.model.UpdateRuleGroupRequest`

  returns: Result of the UpdateRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRuleGroupResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.UpdateRuleGroupResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRuleGroupRequest update-rule-group-request]
    (-> this (.updateRuleGroup update-rule-group-request))))

(defn delete-rule
  "Permanently deletes a Rule. You can't delete a Rule if it's still used in any
   WebACL objects or if it still includes any predicates, such as ByteMatchSet objects.


   If you just want to remove a Rule from a WebACL, use UpdateWebACL.


   To permanently delete a Rule from AWS WAF, perform the following steps:




   Update the Rule to remove predicates, if any. For more information, see UpdateRule.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteRule request.




   Submit a DeleteRule request.

  delete-rule-request - `com.amazonaws.services.waf.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRuleResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRuleRequest delete-rule-request]
    (-> this (.deleteRule delete-rule-request))))

(defn delete-regex-match-set
  "Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in
   any Rules or if it still includes any RegexMatchTuples objects (any filters).


   If you just want to remove a RegexMatchSet from a Rule, use UpdateRule.


   To permanently delete a RegexMatchSet, perform the following steps:




   Update the RegexMatchSet to remove filters, if any. For more information, see
   UpdateRegexMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteRegexMatchSet request.




   Submit a DeleteRegexMatchSet request.

  delete-regex-match-set-request - `com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest`

  returns: Result of the DeleteRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRegexMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteRegexMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest delete-regex-match-set-request]
    (-> this (.deleteRegexMatchSet delete-regex-match-set-request))))

(defn update-xss-match-set
  "Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each
   XssMatchTuple object, you specify the following values:




   Action: Whether to insert the object into or delete the object from the array. To change an
   XssMatchTuple, you delete the existing object and add a new one.




   FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
   inspect a header or custom query parameter, the name of the header or parameter.




   TextTransformation: Which text transformation, if any, to perform on the web request before
   inspecting the request for cross-site scripting attacks.


   You can only specify a single type of TextTransformation.




   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or
   count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body
   and you want to block the requests, you can create an XssMatchSet with the applicable settings, and
   then configure AWS WAF to block the requests.


   To create and configure an XssMatchSet, perform the following steps:




   Submit a CreateXssMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateIPSet request.




   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to
   inspect for cross-site scripting attacks.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-xss-match-set-request - A request to update an XssMatchSet. - `com.amazonaws.services.waf.model.UpdateXssMatchSetRequest`

  returns: Result of the UpdateXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateXssMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.UpdateXssMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateXssMatchSetRequest update-xss-match-set-request]
    (-> this (.updateXssMatchSet update-xss-match-set-request))))

(defn delete-geo-match-set
  "Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any
   Rules or if it still includes any countries.


   If you just want to remove a GeoMatchSet from a Rule, use UpdateRule.


   To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:




   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteGeoMatchSet request.




   Submit a DeleteGeoMatchSet request.

  delete-geo-match-set-request - `com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest`

  returns: Result of the DeleteGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteGeoMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteGeoMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest delete-geo-match-set-request]
    (-> this (.deleteGeoMatchSet delete-geo-match-set-request))))

(defn update-regex-match-set
  "Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each
   RegexMatchSetUpdate object, you specify the following values:




   Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate
   object, you delete the existing object and add a new one.




   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the
   User-Agent header.




   The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
   RegexPatternSet.




   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
   the specified string.




   For example, you can create a RegexPatternSet that matches any requests with User-Agent
   headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those
   requests.


   To create and configure a RegexMatchSet, perform the following steps:




   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateRegexMatchSet request.




   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to
   inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain
   the regular expression patters you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-regex-match-set-request - `com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest`

  returns: Result of the UpdateRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRegexMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.UpdateRegexMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest update-regex-match-set-request]
    (-> this (.updateRegexMatchSet update-regex-match-set-request))))

(defn get-rule-group
  "Returns the RuleGroup that is specified by the RuleGroupId that you included in the
   GetRuleGroup request.


   To view the rules in a rule group, use ListActivatedRulesInRuleGroup.

  get-rule-group-request - `com.amazonaws.services.waf.model.GetRuleGroupRequest`

  returns: Result of the GetRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.GetRuleGroupResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRuleGroupResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRuleGroupRequest get-rule-group-request]
    (-> this (.getRuleGroup get-rule-group-request))))

(defn get-web-acl-for-resource
  "Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.

  get-web-acl-for-resource-request - `com.amazonaws.services.waf.model.GetWebACLForResourceRequest`

  returns: Result of the GetWebACLForResource operation returned by the service. - `com.amazonaws.services.waf.model.GetWebACLForResourceResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetWebACLForResourceResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetWebACLForResourceRequest get-web-acl-for-resource-request]
    (-> this (.getWebACLForResource get-web-acl-for-resource-request))))

(defn create-rule-group
  "Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You
   use UpdateRuleGroup to add rules to the rule group.


   Rule groups are subject to the following limits:




   Three rule groups per account. You can request an increase to this limit by contacting customer support.




   One rule group per web ACL.




   Ten rules per rule group.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-rule-group-request - `com.amazonaws.services.waf.model.CreateRuleGroupRequest`

  returns: Result of the CreateRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.CreateRuleGroupResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateRuleGroupResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRuleGroupRequest create-rule-group-request]
    (-> this (.createRuleGroup create-rule-group-request))))

(defn get-change-token-status
  "Returns the status of a ChangeToken that you got by calling GetChangeToken.
   ChangeTokenStatus is one of the following values:




   PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't
   used it yet in a call to create, update, or delete an AWS WAF object.




   PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.




   INSYNC: Propagation is complete.

  get-change-token-status-request - `com.amazonaws.services.waf.model.GetChangeTokenStatusRequest`

  returns: Result of the GetChangeTokenStatus operation returned by the service. - `com.amazonaws.services.waf.model.GetChangeTokenStatusResult`

  throws: com.amazonaws.services.waf.model.WAFNonexistentItemException - The operation failed because the referenced object doesn't exist."
  (^com.amazonaws.services.waf.model.GetChangeTokenStatusResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetChangeTokenStatusRequest get-change-token-status-request]
    (-> this (.getChangeTokenStatus get-change-token-status-request))))

(defn get-regex-match-set
  "Returns the RegexMatchSet specified by RegexMatchSetId.

  get-regex-match-set-request - `com.amazonaws.services.waf.model.GetRegexMatchSetRequest`

  returns: Result of the GetRegexMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetRegexMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRegexMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRegexMatchSetRequest get-regex-match-set-request]
    (-> this (.getRegexMatchSet get-regex-match-set-request))))

(defn create-byte-match-set
  "Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request
   that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string.
   For example, you can create a ByteMatchSet that matches any requests with User-Agent
   headers that contain the string BadBot. You can then configure AWS WAF to reject those requests.


   To create and configure a ByteMatchSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateByteMatchSet request.




   Submit a CreateByteMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateByteMatchSet request.




   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect
   (for example, the header or the URI) and the value that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-byte-match-set-request - `com.amazonaws.services.waf.model.CreateByteMatchSetRequest`

  returns: Result of the CreateByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateByteMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFDisallowedNameException - The name specified is invalid."
  (^com.amazonaws.services.waf.model.CreateByteMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateByteMatchSetRequest create-byte-match-set-request]
    (-> this (.createByteMatchSet create-byte-match-set-request))))

(defn list-size-constraint-sets
  "Returns an array of SizeConstraintSetSummary objects.

  list-size-constraint-sets-request - `com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest`

  returns: Result of the ListSizeConstraintSets operation returned by the service. - `com.amazonaws.services.waf.model.ListSizeConstraintSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListSizeConstraintSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest list-size-constraint-sets-request]
    (-> this (.listSizeConstraintSets list-size-constraint-sets-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSWAFRegional this]
    (-> this (.shutdown))))

(defn update-byte-match-set
  "Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each
   ByteMatchTuple object, you specify the following values:




   Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate
   object, you delete the existing object and add a new one.




   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
   User-Agent header.




   The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more
   information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
   TargetString in the ByteMatchTuple data type.




   Where to look, such as at the beginning or the end of a query string.




   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
   the specified string.




   For example, you can add a ByteMatchSetUpdate object that matches web requests in which
   User-Agent headers contain the string BadBot. You can then configure AWS WAF to block
   those requests.


   To create and configure a ByteMatchSet, perform the following steps:




   Create a ByteMatchSet. For more information, see CreateByteMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateByteMatchSet request.




   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to
   inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-byte-match-set-request - `com.amazonaws.services.waf.model.UpdateByteMatchSetRequest`

  returns: Result of the UpdateByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateByteMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.UpdateByteMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateByteMatchSetRequest update-byte-match-set-request]
    (-> this (.updateByteMatchSet update-byte-match-set-request))))

(defn list-geo-match-sets
  "Returns an array of GeoMatchSetSummary objects in the response.

  list-geo-match-sets-request - `com.amazonaws.services.waf.model.ListGeoMatchSetsRequest`

  returns: Result of the ListGeoMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListGeoMatchSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListGeoMatchSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListGeoMatchSetsRequest list-geo-match-sets-request]
    (-> this (.listGeoMatchSets list-geo-match-sets-request))))

(defn get-change-token
  "When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in
   the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting
   requests to AWS WAF.


   Each create, update, or delete request must use a unique change token. If your application submits a
   GetChangeToken request and then submits a second GetChangeToken request before
   submitting a create, update, or delete request, the second GetChangeToken request returns the same
   value as the first GetChangeToken request.


   When you use a change token in a create, update, or delete request, the status of the change token changes to
   PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use
   GetChangeTokenStatus to determine the status of your change token.

  get-change-token-request - `com.amazonaws.services.waf.model.GetChangeTokenRequest`

  returns: Result of the GetChangeToken operation returned by the service. - `com.amazonaws.services.waf.model.GetChangeTokenResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetChangeTokenResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetChangeTokenRequest get-change-token-request]
    (-> this (.getChangeToken get-change-token-request))))

(defn delete-size-constraint-set
  "Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still
   used in any Rules or if it still includes any SizeConstraint objects (any filters).


   If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule.


   To permanently delete a SizeConstraintSet, perform the following steps:




   Update the SizeConstraintSet to remove filters, if any. For more information, see
   UpdateSizeConstraintSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteSizeConstraintSet request.




   Submit a DeleteSizeConstraintSet request.

  delete-size-constraint-set-request - `com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest`

  returns: Result of the DeleteSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest delete-size-constraint-set-request]
    (-> this (.deleteSizeConstraintSet delete-size-constraint-set-request))))

(defn get-sql-injection-match-set
  "Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.

  get-sql-injection-match-set-request - A request to get a SqlInjectionMatchSet. - `com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest`

  returns: Result of the GetSqlInjectionMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest get-sql-injection-match-set-request]
    (-> this (.getSqlInjectionMatchSet get-sql-injection-match-set-request))))

(defn list-subscribed-rule-groups
  "Returns an array of RuleGroup objects that you are subscribed to.

  list-subscribed-rule-groups-request - `com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest`

  returns: Result of the ListSubscribedRuleGroups operation returned by the service. - `com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult`

  throws: com.amazonaws.services.waf.model.WAFNonexistentItemException - The operation failed because the referenced object doesn't exist."
  (^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest list-subscribed-rule-groups-request]
    (-> this (.listSubscribedRuleGroups list-subscribed-rule-groups-request))))

(defn list-rule-groups
  "Returns an array of RuleGroup objects.

  list-rule-groups-request - `com.amazonaws.services.waf.model.ListRuleGroupsRequest`

  returns: Result of the ListRuleGroups operation returned by the service. - `com.amazonaws.services.waf.model.ListRuleGroupsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListRuleGroupsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListRuleGroupsRequest list-rule-groups-request]
    (-> this (.listRuleGroups list-rule-groups-request))))

(defn create-rule
  "Creates a Rule, which contains the IPSet objects, ByteMatchSet objects,
   and other predicates that identify the requests that you want to block. If you add more than one predicate to a
   Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose
   that you add the following to a Rule:




   An IPSet that matches the IP address 192.0.2.44/32




   A ByteMatchSet that matches BadBot in the User-Agent header




   You then add the Rule to a WebACL and specify that you want to blocks requests that
   satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44
   and the User-Agent header in the request must contain the value BadBot.


   To create and configure a Rule, perform the following steps:




   Create and update the predicates that you want to include in the Rule. For more information, see
   CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateRule request.




   Submit a CreateRule request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRule request.




   Submit an UpdateRule request to specify the predicates that you want to include in the
   Rule.




   Create and update a WebACL that contains the Rule. For more information, see
   CreateWebACL.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-rule-request - `com.amazonaws.services.waf.model.CreateRuleRequest`

  returns: Result of the CreateRule operation returned by the service. - `com.amazonaws.services.waf.model.CreateRuleResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRuleRequest create-rule-request]
    (-> this (.createRule create-rule-request))))

(defn get-xss-match-set
  "Returns the XssMatchSet that is specified by XssMatchSetId.

  get-xss-match-set-request - A request to get an XssMatchSet. - `com.amazonaws.services.waf.model.GetXssMatchSetRequest`

  returns: Result of the GetXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetXssMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetXssMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetXssMatchSetRequest get-xss-match-set-request]
    (-> this (.getXssMatchSet get-xss-match-set-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"waf-regional.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://waf-regional.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSWAFRegional this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-rule
  "Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies
   a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to
   allow, block, or count. If you add more than one predicate to a Rule, a request must match all of
   the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a
   Rule:




   A ByteMatchSet that matches the value BadBot in the User-Agent header




   An IPSet that matches the IP address 192.0.2.44




   You then add the Rule to a WebACL and specify that you want to block requests that
   satisfy the Rule. For a request to be blocked, the User-Agent header in the request
   must contain the value BadBot and the request must originate from the IP address 192.0.2.44.


   To create and configure a Rule, perform the following steps:




   Create and update the predicates that you want to include in the Rule.




   Create the Rule. See CreateRule.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRule request.




   Submit an UpdateRule request to add predicates to the Rule.




   Create and update a WebACL that contains the Rule. See CreateWebACL.




   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing
   one and add the new one.


   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-rule-request - `com.amazonaws.services.waf.model.UpdateRuleRequest`

  returns: Result of the UpdateRule operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRuleResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRuleRequest update-rule-request]
    (-> this (.updateRule update-rule-request))))

(defn delete-web-acl
  "Permanently deletes a WebACL. You can't delete a WebACL if it still contains any
   Rules.


   To delete a WebACL, perform the following steps:




   Update the WebACL to remove Rules, if any. For more information, see
   UpdateWebACL.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteWebACL request.




   Submit a DeleteWebACL request.

  delete-web-acl-request - `com.amazonaws.services.waf.model.DeleteWebACLRequest`

  returns: Result of the DeleteWebACL operation returned by the service. - `com.amazonaws.services.waf.model.DeleteWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteWebACLRequest delete-web-acl-request]
    (-> this (.deleteWebACL delete-web-acl-request))))

(defn update-regex-pattern-set
  "Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each
   RegexPatternString object, you specify the following values:




   Whether to insert or delete the RegexPatternString.




   The regular expression pattern that you want to insert or delete. For more information, see
   RegexPatternSet.




   For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will
   match this RegexPatternString to:




   BadBot




   BadB0t




   B@dBot




   B@dB0t




   To create and configure a RegexPatternSet, perform the following steps:




   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateRegexPatternSet request.




   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS
   WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-regex-pattern-set-request - `com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest`

  returns: Result of the UpdateRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRegexPatternSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.UpdateRegexPatternSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest update-regex-pattern-set-request]
    (-> this (.updateRegexPatternSet update-regex-pattern-set-request))))

(defn list-rate-based-rules
  "Returns an array of RuleSummary objects.

  list-rate-based-rules-request - `com.amazonaws.services.waf.model.ListRateBasedRulesRequest`

  returns: Result of the ListRateBasedRules operation returned by the service. - `com.amazonaws.services.waf.model.ListRateBasedRulesResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListRateBasedRulesResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListRateBasedRulesRequest list-rate-based-rules-request]
    (-> this (.listRateBasedRules list-rate-based-rules-request))))

(defn update-rate-based-rule
  "Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.


   Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that
   specifies the web requests that you want to block or count. The RateLimit specifies the number of
   requests every five minutes that triggers the rule.


   If you add more than one predicate to a RateBasedRule, a request must match all the predicates and
   exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a
   RateBasedRule:




   An IPSet that matches the IP address 192.0.2.44/32




   A ByteMatchSet that matches BadBot in the User-Agent header




   Further, you specify a RateLimit of 15,000.


   You then add the RateBasedRule to a WebACL and specify that you want to block requests
   that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the
   User-Agent header in the request must contain the value BadBot. Further, requests that
   match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops
   below this limit, AWS WAF no longer blocks the requests.


   As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
   add the following to a RateBasedRule:




   A ByteMatchSet with FieldToMatch of URI




   A PositionalConstraint of STARTS_WITH




   A TargetString of login




   Further, you specify a RateLimit of 15,000.


   By adding this RateBasedRule to a WebACL, you could limit requests to your login page
   without affecting the rest of your site.

  update-rate-based-rule-request - `com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest`

  returns: Result of the UpdateRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.UpdateRateBasedRuleResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateRateBasedRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest update-rate-based-rule-request]
    (-> this (.updateRateBasedRule update-rate-based-rule-request))))

(defn put-permission-policy
  "Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup
   across accounts.


   The PutPermissionPolicy is subject to the following restrictions:




   You can attach only one policy with each PutPermissionPolicy request.




   The policy must include an Effect, Action and Principal.




   Effect must specify Allow.




   The Action in the policy must be waf:UpdateWebACL,
   waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup
   . Any extra or wildcard actions in the policy will be rejected.




   The policy cannot include a Resource parameter.




   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.




   The user making the request must be the owner of the RuleGroup.




   Your policy must be composed using IAM Policy version 2012-10-17.




   For more information, see IAM
   Policies.


   An example of a valid policy parameter is shown in the Examples section below.

  put-permission-policy-request - `com.amazonaws.services.waf.model.PutPermissionPolicyRequest`

  returns: Result of the PutPermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.PutPermissionPolicyResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.PutPermissionPolicyResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.PutPermissionPolicyRequest put-permission-policy-request]
    (-> this (.putPermissionPolicy put-permission-policy-request))))

(defn delete-rate-based-rule
  "Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL
   objects or if it still includes any predicates, such as ByteMatchSet objects.


   If you just want to remove a rule from a WebACL, use UpdateWebACL.


   To permanently delete a RateBasedRule from AWS WAF, perform the following steps:




   Update the RateBasedRule to remove predicates, if any. For more information, see
   UpdateRateBasedRule.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteRateBasedRule request.




   Submit a DeleteRateBasedRule request.

  delete-rate-based-rule-request - `com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest`

  returns: Result of the DeleteRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.DeleteRateBasedRuleResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteRateBasedRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest delete-rate-based-rule-request]
    (-> this (.deleteRateBasedRule delete-rate-based-rule-request))))

(defn list-sql-injection-match-sets
  "Returns an array of SqlInjectionMatchSet objects.

  list-sql-injection-match-sets-request - A request to list the SqlInjectionMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest`

  returns: Result of the ListSqlInjectionMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest list-sql-injection-match-sets-request]
    (-> this (.listSqlInjectionMatchSets list-sql-injection-match-sets-request))))

(defn get-geo-match-set
  "Returns the GeoMatchSet that is specified by GeoMatchSetId.

  get-geo-match-set-request - `com.amazonaws.services.waf.model.GetGeoMatchSetRequest`

  returns: Result of the GetGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetGeoMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetGeoMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetGeoMatchSetRequest get-geo-match-set-request]
    (-> this (.getGeoMatchSet get-geo-match-set-request))))

(defn get-ip-set
  "Returns the IPSet that is specified by IPSetId.

  get-ip-set-request - `com.amazonaws.services.waf.model.GetIPSetRequest`

  returns: Result of the GetIPSet operation returned by the service. - `com.amazonaws.services.waf.model.GetIPSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetIPSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetIPSetRequest get-ip-set-request]
    (-> this (.getIPSet get-ip-set-request))))

(defn get-rate-based-rule
  "Returns the RateBasedRule that is specified by the RuleId that you included in the
   GetRateBasedRule request.

  get-rate-based-rule-request - `com.amazonaws.services.waf.model.GetRateBasedRuleRequest`

  returns: Result of the GetRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.GetRateBasedRuleResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetRateBasedRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetRateBasedRuleRequest get-rate-based-rule-request]
    (-> this (.getRateBasedRule get-rate-based-rule-request))))

(defn put-logging-configuration
  "Associates a LoggingConfiguration with a specified web ACL.


   You can access information about all traffic that AWS WAF inspects using the following steps:




   Create an Amazon Kinesis Data Firehose .


   Create the data firehose with a PUT source and in the region that you are operating. However, if you are
   capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).



   Do not create the data firehose using a Kinesis stream as your source.




   Associate that firehose to your web ACL using a PutLoggingConfiguration request.




   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a
   service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
   information, see Logging Web ACL
   Traffic Information in the AWS WAF Developer Guide.

  put-logging-configuration-request - `com.amazonaws.services.waf.model.PutLoggingConfigurationRequest`

  returns: Result of the PutLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.PutLoggingConfigurationResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.PutLoggingConfigurationResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.PutLoggingConfigurationRequest put-logging-configuration-request]
    (-> this (.putLoggingConfiguration put-logging-configuration-request))))

(defn list-activated-rules-in-rule-group
  "Returns an array of ActivatedRule objects.

  list-activated-rules-in-rule-group-request - `com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest`

  returns: Result of the ListActivatedRulesInRuleGroup operation returned by the service. - `com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest list-activated-rules-in-rule-group-request]
    (-> this (.listActivatedRulesInRuleGroup list-activated-rules-in-rule-group-request))))

(defn associate-web-acl
  "Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.

  associate-web-acl-request - `com.amazonaws.services.waf.model.AssociateWebACLRequest`

  returns: Result of the AssociateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.AssociateWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.AssociateWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.AssociateWebACLRequest associate-web-acl-request]
    (-> this (.associateWebACL associate-web-acl-request))))

(defn delete-logging-configuration
  "Permanently deletes the LoggingConfiguration from the specified web ACL.

  delete-logging-configuration-request - `com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest`

  returns: Result of the DeleteLoggingConfiguration operation returned by the service. - `com.amazonaws.services.waf.model.DeleteLoggingConfigurationResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.DeleteLoggingConfigurationResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteLoggingConfigurationRequest delete-logging-configuration-request]
    (-> this (.deleteLoggingConfiguration delete-logging-configuration-request))))

(defn list-byte-match-sets
  "Returns an array of ByteMatchSetSummary objects.

  list-byte-match-sets-request - `com.amazonaws.services.waf.model.ListByteMatchSetsRequest`

  returns: Result of the ListByteMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListByteMatchSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListByteMatchSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListByteMatchSetsRequest list-byte-match-sets-request]
    (-> this (.listByteMatchSets list-byte-match-sets-request))))

(defn get-sampled-requests
  "Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
   among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
   specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.


   GetSampledRequests returns a time range, which is usually the time range that you specified.
   However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
   range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the
   actual period during which AWS WAF selected the requests in the sample.

  get-sampled-requests-request - `com.amazonaws.services.waf.model.GetSampledRequestsRequest`

  returns: Result of the GetSampledRequests operation returned by the service. - `com.amazonaws.services.waf.model.GetSampledRequestsResult`

  throws: com.amazonaws.services.waf.model.WAFNonexistentItemException - The operation failed because the referenced object doesn't exist."
  (^com.amazonaws.services.waf.model.GetSampledRequestsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetSampledRequestsRequest get-sampled-requests-request]
    (-> this (.getSampledRequests get-sampled-requests-request))))

(defn list-xss-match-sets
  "Returns an array of XssMatchSet objects.

  list-xss-match-sets-request - A request to list the XssMatchSet objects created by the current AWS account. - `com.amazonaws.services.waf.model.ListXssMatchSetsRequest`

  returns: Result of the ListXssMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListXssMatchSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListXssMatchSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListXssMatchSetsRequest list-xss-match-sets-request]
    (-> this (.listXssMatchSets list-xss-match-sets-request))))

(defn list-regex-match-sets
  "Returns an array of RegexMatchSetSummary objects.

  list-regex-match-sets-request - `com.amazonaws.services.waf.model.ListRegexMatchSetsRequest`

  returns: Result of the ListRegexMatchSets operation returned by the service. - `com.amazonaws.services.waf.model.ListRegexMatchSetsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListRegexMatchSetsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListRegexMatchSetsRequest list-regex-match-sets-request]
    (-> this (.listRegexMatchSets list-regex-match-sets-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSWAFRegional this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-web-acl
  "Returns the WebACL that is specified by WebACLId.

  get-web-acl-request - `com.amazonaws.services.waf.model.GetWebACLRequest`

  returns: Result of the GetWebACL operation returned by the service. - `com.amazonaws.services.waf.model.GetWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetWebACLRequest get-web-acl-request]
    (-> this (.getWebACL get-web-acl-request))))

(defn get-permission-policy
  "Returns the IAM policy attached to the RuleGroup.

  get-permission-policy-request - `com.amazonaws.services.waf.model.GetPermissionPolicyRequest`

  returns: Result of the GetPermissionPolicy operation returned by the service. - `com.amazonaws.services.waf.model.GetPermissionPolicyResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetPermissionPolicyResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetPermissionPolicyRequest get-permission-policy-request]
    (-> this (.getPermissionPolicy get-permission-policy-request))))

(defn create-xss-match-set
  "Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting
   attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be
   malicious strings.


   To create and configure an XssMatchSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateXssMatchSet request.




   Submit a CreateXssMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateXssMatchSet request.




   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow,
   block, or count cross-site scripting attacks.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-xss-match-set-request - A request to create an XssMatchSet. - `com.amazonaws.services.waf.model.CreateXssMatchSetRequest`

  returns: Result of the CreateXssMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateXssMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFDisallowedNameException - The name specified is invalid."
  (^com.amazonaws.services.waf.model.CreateXssMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateXssMatchSetRequest create-xss-match-set-request]
    (-> this (.createXssMatchSet create-xss-match-set-request))))

(defn create-regex-pattern-set
  "Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular
   expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then
   configure AWS WAF to reject those requests.


   To create and configure a RegexPatternSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateRegexPatternSet request.




   Submit a CreateRegexPatternSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRegexPatternSet request.




   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-regex-pattern-set-request - `com.amazonaws.services.waf.model.CreateRegexPatternSetRequest`

  returns: Result of the CreateRegexPatternSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateRegexPatternSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateRegexPatternSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRegexPatternSetRequest create-regex-pattern-set-request]
    (-> this (.createRegexPatternSet create-regex-pattern-set-request))))

(defn list-rules
  "Returns an array of RuleSummary objects.

  list-rules-request - `com.amazonaws.services.waf.model.ListRulesRequest`

  returns: Result of the ListRules operation returned by the service. - `com.amazonaws.services.waf.model.ListRulesResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListRulesResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListRulesRequest list-rules-request]
    (-> this (.listRules list-rules-request))))

(defn create-ip-set
  "Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the
   IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or
   more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can
   create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.


   To create and configure an IPSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateIPSet request.




   Submit a CreateIPSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateIPSet request.




   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-ip-set-request - `com.amazonaws.services.waf.model.CreateIPSetRequest`

  returns: Result of the CreateIPSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateIPSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateIPSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateIPSetRequest create-ip-set-request]
    (-> this (.createIPSet create-ip-set-request))))

(defn tag-resource
  "tag-resource-request - `com.amazonaws.services.waf.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.waf.model.TagResourceResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.TagResourceResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn create-size-constraint-set
  "Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a
   web request that you want AWS WAF to check for length, such as the length of the User-Agent header
   or the length of the query string. For example, you can create a SizeConstraintSet that matches any
   requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those
   requests.


   To create and configure a SizeConstraintSet, perform the following steps:




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateSizeConstraintSet request.




   Submit a CreateSizeConstraintSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateSizeConstraintSet request.




   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to
   inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-size-constraint-set-request - `com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest`

  returns: Result of the CreateSizeConstraintSet operation returned by the service. - `com.amazonaws.services.waf.model.CreateSizeConstraintSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateSizeConstraintSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest create-size-constraint-set-request]
    (-> this (.createSizeConstraintSet create-size-constraint-set-request))))

(defn update-geo-match-set
  "Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each
   GeoMatchConstraint object, you specify the following values:




   Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint
   object, you delete the existing object and add a new one.




   The Type. The only valid value for Type is Country.




   The Value, which is a two character code for the country to add to the
   GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.




   To create and configure an GeoMatchSet, perform the following steps:




   Submit a CreateGeoMatchSet request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of
   an UpdateGeoMatchSet request.




   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.




   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that
   you want to delete. If you want to change a country, you delete the existing country and add the new one.


   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  update-geo-match-set-request - `com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest`

  returns: Result of the UpdateGeoMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.UpdateGeoMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.UpdateGeoMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest update-geo-match-set-request]
    (-> this (.updateGeoMatchSet update-geo-match-set-request))))

(defn list-logging-configurations
  "Returns an array of LoggingConfiguration objects.

  list-logging-configurations-request - `com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest`

  returns: Result of the ListLoggingConfigurations operation returned by the service. - `com.amazonaws.services.waf.model.ListLoggingConfigurationsResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.ListLoggingConfigurationsResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.ListLoggingConfigurationsRequest list-logging-configurations-request]
    (-> this (.listLoggingConfigurations list-logging-configurations-request))))

(defn create-web-acl
  "Creates a WebACL, which contains the Rules that identify the CloudFront web requests
   that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of
   Priority for each Rule.


   You also specify a default action, either ALLOW or BLOCK. If a web request doesn't
   match any of the Rules in a WebACL, AWS WAF responds to the request with the default
   action.


   To create and configure a WebACL, perform the following steps:




   Create and update the ByteMatchSet objects and other predicates that you want to include in
   Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet,
   CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.




   Create and update the Rules that you want to include in the WebACL. For more
   information, see CreateRule and UpdateRule.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateWebACL request.




   Submit a CreateWebACL request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateWebACL request.




   Submit an UpdateWebACL request to specify the Rules that you want to include in the
   WebACL, to specify the default action, and to associate the WebACL with a CloudFront
   distribution.




   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.

  create-web-acl-request - `com.amazonaws.services.waf.model.CreateWebACLRequest`

  returns: Result of the CreateWebACL operation returned by the service. - `com.amazonaws.services.waf.model.CreateWebACLResult`

  throws: com.amazonaws.services.waf.model.WAFInvalidAccountException - The operation failed because you tried to create, update, or delete an object by using an invalid account identifier."
  (^com.amazonaws.services.waf.model.CreateWebACLResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateWebACLRequest create-web-acl-request]
    (-> this (.createWebACL create-web-acl-request))))

(defn get-byte-match-set
  "Returns the ByteMatchSet specified by ByteMatchSetId.

  get-byte-match-set-request - `com.amazonaws.services.waf.model.GetByteMatchSetRequest`

  returns: Result of the GetByteMatchSet operation returned by the service. - `com.amazonaws.services.waf.model.GetByteMatchSetResult`

  throws: com.amazonaws.services.waf.model.WAFInternalErrorException - The operation failed because of a system problem, even though the request was valid. Retry your request."
  (^com.amazonaws.services.waf.model.GetByteMatchSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.GetByteMatchSetRequest get-byte-match-set-request]
    (-> this (.getByteMatchSet get-byte-match-set-request))))

(defn delete-ip-set
  "Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any
   Rules or if it still includes any IP addresses.


   If you just want to remove an IPSet from a Rule, use UpdateRule.


   To permanently delete an IPSet from AWS WAF, perform the following steps:




   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   DeleteIPSet request.




   Submit a DeleteIPSet request.

  delete-ip-set-request - `com.amazonaws.services.waf.model.DeleteIPSetRequest`

  returns: Result of the DeleteIPSet operation returned by the service. - `com.amazonaws.services.waf.model.DeleteIPSetResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.DeleteIPSetResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.DeleteIPSetRequest delete-ip-set-request]
    (-> this (.deleteIPSet delete-ip-set-request))))

(defn create-rate-based-rule
  "Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies
   the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The
   RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and
   other predicates that identify the requests that you want to count or block if these requests exceed the
   RateLimit.


   If you add more than one predicate to a RateBasedRule, a request not only must exceed the
   RateLimit, but it also must match all the specifications to be counted or blocked. For example,
   suppose you add the following to a RateBasedRule:




   An IPSet that matches the IP address 192.0.2.44/32




   A ByteMatchSet that matches BadBot in the User-Agent header




   Further, you specify a RateLimit of 15,000.


   You then add the RateBasedRule to a WebACL and specify that you want to block requests
   that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44
   and the User-Agent header in the request must contain the value BadBot. Further,
   requests that match these two conditions must be received at a rate of more than 15,000 requests every five
   minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops
   below 15,000 for a five-minute period, AWS WAF no longer blocks the requests.


   As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
   add the following to a RateBasedRule:




   A ByteMatchSet with FieldToMatch of URI




   A PositionalConstraint of STARTS_WITH




   A TargetString of login




   Further, you specify a RateLimit of 15,000.


   By adding this RateBasedRule to a WebACL, you could limit requests to your login page
   without affecting the rest of your site.


   To create and configure a RateBasedRule, perform the following steps:




   Create and update the predicates that you want to include in the rule. For more information, see
   CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.




   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a
   CreateRule request.




   Submit a CreateRateBasedRule request.




   Use GetChangeToken to get the change token that you provide in the ChangeToken
   parameter of an UpdateRule request.




   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the
   rule.




   Create and update a WebACL that contains the RateBasedRule. For more information, see
   CreateWebACL.




   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.

  create-rate-based-rule-request - `com.amazonaws.services.waf.model.CreateRateBasedRuleRequest`

  returns: Result of the CreateRateBasedRule operation returned by the service. - `com.amazonaws.services.waf.model.CreateRateBasedRuleResult`

  throws: com.amazonaws.services.waf.model.WAFStaleDataException - The operation failed because you tried to create, update, or delete an object by using a change token that has already been used."
  (^com.amazonaws.services.waf.model.CreateRateBasedRuleResult [^AWSWAFRegional this ^com.amazonaws.services.waf.model.CreateRateBasedRuleRequest create-rate-based-rule-request]
    (-> this (.createRateBasedRule create-rate-based-rule-request))))

