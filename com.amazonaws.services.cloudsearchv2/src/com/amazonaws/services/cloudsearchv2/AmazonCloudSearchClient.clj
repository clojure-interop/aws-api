(ns com.amazonaws.services.cloudsearchv2.AmazonCloudSearchClient
  "Client for accessing Amazon CloudSearch. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon CloudSearch Configuration Service

  You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
  service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
  via HTTP GET or POST with a query parameter named Action.


  The endpoint for configuration service requests is region-specific: cloudsearch.region.amazonaws.com. For
  example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions and
  Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchv2 AmazonCloudSearchClient]))

(defn ->amazon-cloud-search-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCloudSearchClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCloudSearchClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCloudSearchClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudSearchClient aws-credentials client-configuration))
  (^AmazonCloudSearchClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudSearchClient client-configuration))
  (^AmazonCloudSearchClient []
    (new AmazonCloudSearchClient )))

(defn *builder
  "returns: `com.amazonaws.services.cloudsearchv2.AmazonCloudSearchClientBuilder`"
  (^com.amazonaws.services.cloudsearchv2.AmazonCloudSearchClientBuilder []
    (AmazonCloudSearchClient/builder )))

(defn delete-index-field
  "Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest`

  returns: Result of the DeleteIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest request]
    (-> this (.deleteIndexField request))))

(defn describe-index-fields
  "Gets information about the index fields configured for the search domain. Can be limited to specific fields by
   name. By default, shows all fields and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest`

  returns: Result of the DescribeIndexFields operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest request]
    (-> this (.describeIndexFields request))))

(defn describe-service-access-policies
  "Gets information about the access policies that control access to the domain's document and search endpoints. By
   default, shows the configuration with any pending changes. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest`

  returns: Result of the DescribeServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest request]
    (-> this (.describeServiceAccessPolicies request))))

(defn index-documents
  "Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
   invoked to activate options whose OptionStatus is RequiresIndexDocuments.

  request - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest`

  returns: Result of the IndexDocuments operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest request]
    (-> this (.indexDocuments request))))

(defn delete-analysis-scheme
  "Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest`

  returns: Result of the DeleteAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest request]
    (-> this (.deleteAnalysisScheme request))))

(defn describe-suggesters
  "Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users
   finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and
   includes any pending changes to the configuration. Set the Deployed option to true to
   show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest`

  returns: Result of the DescribeSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest request]
    (-> this (.describeSuggesters request))))

(defn define-suggester
  "Configures a suggester for a domain. A suggester enables you to display possible matches before users finish
   typing their queries. When you configure a suggester, you must specify the name of the text field you want to
   search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest`

  returns: Result of the DefineSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest request]
    (-> this (.defineSuggester request))))

(defn delete-domain
  "Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered.
   For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest request]
    (-> this (.deleteDomain request))))

(defn define-index-field
  "Configures an IndexField for the search domain. Used to create new fields and modify existing
   ones. You must specify the name of the domain you are configuring and an index field configuration. The index
   field configuration specifies a unique name, the index field type, and the options you want to configure for the
   field. The options you can specify depend on the IndexFieldType. If the field exists, the new
   configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest`

  returns: Result of the DefineIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest request]
    (-> this (.defineIndexField request))))

(defn create-domain
  "Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.CreateDomainResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest request]
    (-> this (.createDomain request))))

(defn update-availability-options
  "Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch
   domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a
   service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more
   information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest`

  returns: Result of the UpdateAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest request]
    (-> this (.updateAvailabilityOptions request))))

(defn describe-scaling-parameters
  "Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search
   instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest`

  returns: Result of the DescribeScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest request]
    (-> this (.describeScalingParameters request))))

(defn describe-analysis-schemes
  "Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing
   options for a text field. Can be limited to specific analysis schemes by name. By default, shows all
   analysis schemes and includes any pending changes to the configuration. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest`

  returns: Result of the DescribeAnalysisSchemes operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest request]
    (-> this (.describeAnalysisSchemes request))))

(defn delete-suggester
  "Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest`

  returns: Result of the DeleteSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest request]
    (-> this (.deleteSuggester request))))

(defn define-analysis-scheme
  "Configures an analysis scheme that can be applied to a text or text-array field to
   define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest`

  returns: Result of the DefineAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest request]
    (-> this (.defineAnalysisScheme request))))

(defn update-scaling-parameters
  "Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance
   type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of
   data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is
   enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest`

  returns: Result of the UpdateScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest request]
    (-> this (.updateScalingParameters request))))

(defn describe-domains
  "Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all
   domains by default. To get the number of searchable documents in a domain, use the console or submit a
   matchall request to your domain's search endpoint:
   q=matchall&amp;q.parser=structured&amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest`

  returns: Result of the DescribeDomains operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest request]
    (-> this (.describeDomains request)))
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AmazonCloudSearchClient this]
    (-> this (.describeDomains))))

(defn delete-expression
  "Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest`

  returns: Result of the DeleteExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest request]
    (-> this (.deleteExpression request))))

(defn list-domain-names
  "Lists all search domains owned by an account.

  request - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest request]
    (-> this (.listDomainNames request)))
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AmazonCloudSearchClient this]
    (-> this (.listDomainNames))))

(defn define-expression
  "Configures an Expression for the search domain. Used to create new expressions and modify
   existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest`

  returns: Result of the DefineExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest request]
    (-> this (.defineExpression request))))

(defn describe-availability-options
  "Gets the availability options configured for a domain. By default, shows the configuration with any pending
   changes. Set the Deployed option to true to show the active configuration and exclude
   pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest`

  returns: Result of the DescribeAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest request]
    (-> this (.describeAvailabilityOptions request))))

(defn describe-expressions
  "Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By
   default, shows all expressions and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest`

  returns: Result of the DescribeExpressions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest request]
    (-> this (.describeExpressions request))))

(defn update-service-access-policies
  "Configures the access rules that control access to the domain's document and search endpoints. For more
   information, see  Configuring Access for an Amazon CloudSearch Domain.

  request - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest`

  returns: Result of the UpdateServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest request]
    (-> this (.updateServiceAccessPolicies request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudSearchClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn build-suggesters
  "Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.

  request - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest`

  returns: Result of the BuildSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult`

  throws: com.amazonaws.services.cloudsearchv2.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult [^AmazonCloudSearchClient this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest request]
    (-> this (.buildSuggesters request))))

