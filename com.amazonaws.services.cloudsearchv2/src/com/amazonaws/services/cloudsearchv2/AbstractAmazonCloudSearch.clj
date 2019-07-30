(ns com.amazonaws.services.cloudsearchv2.AbstractAmazonCloudSearch
  "Abstract implementation of AmazonCloudSearch. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchv2 AbstractAmazonCloudSearch]))

(defn delete-index-field
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DeleteIndexField operation. Specifies the name of the domain you want to update and the name of the index field you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest`

  returns: Result of the DeleteIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest request]
    (-> this (.deleteIndexField request))))

(defn describe-index-fields
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeIndexFields operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest`

  returns: Result of the DescribeIndexFields operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest request]
    (-> this (.describeIndexFields request))))

(defn describe-service-access-policies
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeServiceAccessPolicies operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest`

  returns: Result of the DescribeServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest request]
    (-> this (.describeServiceAccessPolicies request))))

(defn set-region
  "Description copied from interface: AmazonCloudSearch

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudSearch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn index-documents
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the IndexDocuments operation. Specifies the name of the domain you want to re-index. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest`

  returns: Result of the IndexDocuments operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest request]
    (-> this (.indexDocuments request))))

(defn delete-analysis-scheme
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DeleteAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest`

  returns: Result of the DeleteAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest request]
    (-> this (.deleteAnalysisScheme request))))

(defn describe-suggesters
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeSuggester operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest`

  returns: Result of the DescribeSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest request]
    (-> this (.describeSuggesters request))))

(defn define-suggester
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DefineSuggester operation. Specifies the name of the domain you want to update and the suggester configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest`

  returns: Result of the DefineSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest request]
    (-> this (.defineSuggester request))))

(defn delete-domain
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DeleteDomain operation. Specifies the name of the domain you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest request]
    (-> this (.deleteDomain request))))

(defn define-index-field
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DefineIndexField operation. Specifies the name of the domain you want to update and the index field configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest`

  returns: Result of the DefineIndexField operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest request]
    (-> this (.defineIndexField request))))

(defn create-domain
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the CreateDomain operation. Specifies a name for the new search domain. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainResult`"
  (^com.amazonaws.services.cloudsearchv2.model.CreateDomainResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest request]
    (-> this (.createDomain request))))

(defn update-availability-options
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the UpdateAvailabilityOptions operation. Specifies the name of the domain you want to update and the Multi-AZ availability option. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest`

  returns: Result of the UpdateAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest request]
    (-> this (.updateAvailabilityOptions request))))

(defn describe-scaling-parameters
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeScalingParameters operation. Specifies the name of the domain you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest`

  returns: Result of the DescribeScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest request]
    (-> this (.describeScalingParameters request))))

(defn shutdown
  "Description copied from interface: AmazonCloudSearch"
  ([^AbstractAmazonCloudSearch this]
    (-> this (.shutdown))))

(defn describe-analysis-schemes
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeAnalysisSchemes operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest`

  returns: Result of the DescribeAnalysisSchemes operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest request]
    (-> this (.describeAnalysisSchemes request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudSearch

  endpoint - The endpoint (ex: \"cloudsearch.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudsearch.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudSearch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-suggester
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DeleteSuggester operation. Specifies the name of the domain you want to update and name of the suggester you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest`

  returns: Result of the DeleteSuggester operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest request]
    (-> this (.deleteSuggester request))))

(defn define-analysis-scheme
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DefineAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest`

  returns: Result of the DefineAnalysisScheme operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest request]
    (-> this (.defineAnalysisScheme request))))

(defn update-scaling-parameters
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the UpdateScalingParameters operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest`

  returns: Result of the UpdateScalingParameters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult`"
  (^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest request]
    (-> this (.updateScalingParameters request))))

(defn describe-domains
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeDomains operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest`

  returns: Result of the DescribeDomains operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest request]
    (-> this (.describeDomains request)))
  (^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult [^AbstractAmazonCloudSearch this]
    (-> this (.describeDomains))))

(defn delete-expression
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DeleteExpression operation. Specifies the name of the domain you want to update and the name of the expression you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest`

  returns: Result of the DeleteExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest request]
    (-> this (.deleteExpression request))))

(defn list-domain-names
  "Description copied from interface: AmazonCloudSearch

  request - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult`"
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest request]
    (-> this (.listDomainNames request)))
  (^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult [^AbstractAmazonCloudSearch this]
    (-> this (.listDomainNames))))

(defn define-expression
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DefineExpression operation. Specifies the name of the domain you want to update and the expression you want to configure. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest`

  returns: Result of the DefineExpression operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest request]
    (-> this (.defineExpression request))))

(defn describe-availability-options
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeAvailabilityOptions operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest`

  returns: Result of the DescribeAvailabilityOptions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest request]
    (-> this (.describeAvailabilityOptions request))))

(defn describe-expressions
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the DescribeDomains operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest`

  returns: Result of the DescribeExpressions operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult`"
  (^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest request]
    (-> this (.describeExpressions request))))

(defn update-service-access-policies
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the UpdateServiceAccessPolicies operation. Specifies the name of the domain you want to update and the access rules you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest`

  returns: Result of the UpdateServiceAccessPolicies operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult`"
  (^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest request]
    (-> this (.updateServiceAccessPolicies request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudSearch

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudSearch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn build-suggesters
  "Description copied from interface: AmazonCloudSearch

  request - Container for the parameters to the BuildSuggester operation. Specifies the name of the domain you want to update. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest`

  returns: Result of the BuildSuggesters operation returned by the service. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult`"
  (^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult [^AbstractAmazonCloudSearch this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest request]
    (-> this (.buildSuggesters request))))

