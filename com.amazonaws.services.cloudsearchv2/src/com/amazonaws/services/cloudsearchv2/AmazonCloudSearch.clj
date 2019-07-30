(ns com.amazonaws.services.cloudsearchv2.AmazonCloudSearch
  "Interface for accessing Amazon CloudSearch.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudSearch instead.


  Amazon CloudSearch Configuration Service

  You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
  service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
  via HTTP GET or POST with a query parameter named Action.


  The endpoint for configuration service requests is region-specific: cloudsearch.region.amazonaws.com. For
  example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions and
  Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchv2 AmazonCloudSearch]))

(defn delete-index-field
  "Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  delete-index-field-request - Container for the parameters to the DeleteIndexField operation. Specifies the name of the domain you want to update and the name of the index field you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest`

  returns: Result of the DeleteIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest delete-index-field-request]
    (-> this (.deleteIndexField delete-index-field-request))))

(defn describe-index-fields
  "Gets information about the index fields configured for the search domain. Can be limited to specific fields by
   name. By default, shows all fields and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.

  describe-index-fields-request - Container for the parameters to the DescribeIndexFields operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest`

  returns: Result of the DescribeIndexFields operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest describe-index-fields-request]
    (-> this (.describeIndexFields describe-index-fields-request))))

(defn describe-service-access-policies
  "Gets information about the access policies that control access to the domain's document and search endpoints. By
   default, shows the configuration with any pending changes. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.

  describe-service-access-policies-request - Container for the parameters to the DescribeServiceAccessPolicies operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest`

  returns: Result of the DescribeServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest describe-service-access-policies-request]
    (-> this (.describeServiceAccessPolicies describe-service-access-policies-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudSearch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn index-documents
  "Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
   invoked to activate options whose OptionStatus is RequiresIndexDocuments.

  index-documents-request - Container for the parameters to the IndexDocuments operation. Specifies the name of the domain you want to re-index. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest`

  returns: Result of the IndexDocuments operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest index-documents-request]
    (-> this (.indexDocuments index-documents-request))))

(defn delete-analysis-scheme
  "Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  delete-analysis-scheme-request - Container for the parameters to the DeleteAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest`

  returns: Result of the DeleteAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest delete-analysis-scheme-request]
    (-> this (.deleteAnalysisScheme delete-analysis-scheme-request))))

(defn describe-suggesters
  "Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users
   finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and
   includes any pending changes to the configuration. Set the Deployed option to true to
   show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  describe-suggesters-request - Container for the parameters to the DescribeSuggester operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest`

  returns: Result of the DescribeSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest describe-suggesters-request]
    (-> this (.describeSuggesters describe-suggesters-request))))

(defn define-suggester
  "Configures a suggester for a domain. A suggester enables you to display possible matches before users finish
   typing their queries. When you configure a suggester, you must specify the name of the text field you want to
   search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  define-suggester-request - Container for the parameters to the DefineSuggester operation. Specifies the name of the domain you want to update and the suggester configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest`

  returns: Result of the DefineSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest define-suggester-request]
    (-> this (.defineSuggester define-suggester-request))))

(defn delete-domain
  "Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered.
   For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide.

  delete-domain-request - Container for the parameters to the DeleteDomain operation. Specifies the name of the domain you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest delete-domain-request]
    (-> this (.deleteDomain delete-domain-request))))

(defn define-index-field
  "Configures an IndexField for the search domain. Used to create new fields and modify existing
   ones. You must specify the name of the domain you are configuring and an index field configuration. The index
   field configuration specifies a unique name, the index field type, and the options you want to configure for the
   field. The options you can specify depend on the IndexFieldType. If the field exists, the new
   configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  define-index-field-request - Container for the parameters to the DefineIndexField operation. Specifies the name of the domain you want to update and the index field configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest`

  returns: Result of the DefineIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest define-index-field-request]
    (-> this (.defineIndexField define-index-field-request))))

(defn create-domain
  "Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.

  create-domain-request - Container for the parameters to the CreateDomain operation. Specifies a name for the new search domain. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.CreateDomainResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest create-domain-request]
    (-> this (.createDomain create-domain-request))))

(defn update-availability-options
  "Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch
   domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a
   service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more
   information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  update-availability-options-request - Container for the parameters to the UpdateAvailabilityOptions operation. Specifies the name of the domain you want to update and the Multi-AZ availability option. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest`

  returns: Result of the UpdateAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest update-availability-options-request]
    (-> this (.updateAvailabilityOptions update-availability-options-request))))

(defn describe-scaling-parameters
  "Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search
   instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  describe-scaling-parameters-request - Container for the parameters to the DescribeScalingParameters operation. Specifies the name of the domain you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest`

  returns: Result of the DescribeScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest describe-scaling-parameters-request]
    (-> this (.describeScalingParameters describe-scaling-parameters-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudSearch this]
    (-> this (.shutdown))))

(defn describe-analysis-schemes
  "Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing
   options for a text field. Can be limited to specific analysis schemes by name. By default, shows all
   analysis schemes and includes any pending changes to the configuration. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  describe-analysis-schemes-request - Container for the parameters to the DescribeAnalysisSchemes operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest`

  returns: Result of the DescribeAnalysisSchemes operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest describe-analysis-schemes-request]
    (-> this (.describeAnalysisSchemes describe-analysis-schemes-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cloudsearch.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudsearch.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudSearch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-suggester
  "Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  delete-suggester-request - Container for the parameters to the DeleteSuggester operation. Specifies the name of the domain you want to update and name of the suggester you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest`

  returns: Result of the DeleteSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest delete-suggester-request]
    (-> this (.deleteSuggester delete-suggester-request))))

(defn define-analysis-scheme
  "Configures an analysis scheme that can be applied to a text or text-array field to
   define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  define-analysis-scheme-request - Container for the parameters to the DefineAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest`

  returns: Result of the DefineAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest define-analysis-scheme-request]
    (-> this (.defineAnalysisScheme define-analysis-scheme-request))))

(defn update-scaling-parameters
  "Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance
   type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of
   data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is
   enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  update-scaling-parameters-request - Container for the parameters to the UpdateScalingParameters operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest`

  returns: Result of the UpdateScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest update-scaling-parameters-request]
    (-> this (.updateScalingParameters update-scaling-parameters-request))))

(defn describe-domains
  "Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all
   domains by default. To get the number of searchable documents in a domain, use the console or submit a
   matchall request to your domain's search endpoint:
   q=matchall&amp;q.parser=structured&amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.

  describe-domains-request - Container for the parameters to the DescribeDomains operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest`

  returns: Result of the DescribeDomains operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest describe-domains-request]
    (-> this (.describeDomains describe-domains-request)))
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AmazonCloudSearch this]
    (-> this (.describeDomains))))

(defn delete-expression
  "Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  delete-expression-request - Container for the parameters to the DeleteExpression operation. Specifies the name of the domain you want to update and the name of the expression you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest`

  returns: Result of the DeleteExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest delete-expression-request]
    (-> this (.deleteExpression delete-expression-request))))

(defn list-domain-names
  "Lists all search domains owned by an account.

  list-domain-names-request - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest list-domain-names-request]
    (-> this (.listDomainNames list-domain-names-request)))
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AmazonCloudSearch this]
    (-> this (.listDomainNames))))

(defn define-expression
  "Configures an Expression for the search domain. Used to create new expressions and modify
   existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  define-expression-request - Container for the parameters to the DefineExpression operation. Specifies the name of the domain you want to update and the expression you want to configure. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest`

  returns: Result of the DefineExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest define-expression-request]
    (-> this (.defineExpression define-expression-request))))

(defn describe-availability-options
  "Gets the availability options configured for a domain. By default, shows the configuration with any pending
   changes. Set the Deployed option to true to show the active configuration and exclude
   pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  describe-availability-options-request - Container for the parameters to the DescribeAvailabilityOptions operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest`

  returns: Result of the DescribeAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest describe-availability-options-request]
    (-> this (.describeAvailabilityOptions describe-availability-options-request))))

(defn describe-expressions
  "Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By
   default, shows all expressions and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  describe-expressions-request - Container for the parameters to the DescribeDomains operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest`

  returns: Result of the DescribeExpressions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest describe-expressions-request]
    (-> this (.describeExpressions describe-expressions-request))))

(defn update-service-access-policies
  "Configures the access rules that control access to the domain's document and search endpoints. For more
   information, see  Configuring Access for an Amazon CloudSearch Domain.

  update-service-access-policies-request - Container for the parameters to the UpdateServiceAccessPolicies operation. Specifies the name of the domain you want to update and the access rules you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest`

  returns: Result of the UpdateServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest update-service-access-policies-request]
    (-> this (.updateServiceAccessPolicies update-service-access-policies-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudSearch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn build-suggesters
  "Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.

  build-suggesters-request - Container for the parameters to the BuildSuggester operation. Specifies the name of the domain you want to update. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest`

  returns: Result of the BuildSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult [^AmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest build-suggesters-request]
    (-> this (.buildSuggesters build-suggesters-request))))

