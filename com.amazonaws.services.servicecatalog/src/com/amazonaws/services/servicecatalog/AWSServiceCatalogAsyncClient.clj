(ns com.amazonaws.services.servicecatalog.AWSServiceCatalogAsyncClient
  "Client for accessing AWS Service Catalog asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Service Catalog

  AWS Service Catalog enables organizations to create and manage
  catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
  familiar with the terminology discussed in AWS Service Catalog
  Concepts."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicecatalog AWSServiceCatalogAsyncClient]))

(defn ->aws-service-catalog-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSServiceCatalogAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSServiceCatalogAsyncClient aws-credentials client-configuration executor-service))
  (^AWSServiceCatalogAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSServiceCatalogAsyncClient aws-credentials executor-service))
  (^AWSServiceCatalogAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSServiceCatalogAsyncClient client-configuration))
  (^AWSServiceCatalogAsyncClient []
    (new AWSServiceCatalogAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.servicecatalog.AWSServiceCatalogAsyncClientBuilder`"
  (^com.amazonaws.services.servicecatalog.AWSServiceCatalogAsyncClientBuilder []
    (AWSServiceCatalogAsyncClient/asyncBuilder )))

(defn describe-constraint-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConstraintAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest request]
    (-> this (.describeConstraintAsync request))))

(defn describe-product-view-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProductView operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductViewResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductViewAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest request]
    (-> this (.describeProductViewAsync request))))

(defn delete-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest request]
    (-> this (.deleteProvisioningArtifactAsync request))))

(defn create-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest request]
    (-> this (.createServiceActionAsync request))))

(defn describe-copy-product-status-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCopyProductStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCopyProductStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest request]
    (-> this (.describeCopyProductStatusAsync request))))

(defn describe-portfolio-share-status-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePortfolioShareStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePortfolioShareStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest request]
    (-> this (.describePortfolioShareStatusAsync request))))

(defn search-products-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest request]
    (-> this (.searchProductsAsync request))))

(defn disassociate-service-action-from-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceActionFromProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceActionFromProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.disassociateServiceActionFromProvisioningArtifactAsync request))))

(defn update-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest request]
    (-> this (.updatePortfolioAsync request))))

(defn list-accepted-portfolio-shares-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAcceptedPortfolioSharesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest request]
    (-> this (.listAcceptedPortfolioSharesAsync request))))

(defn search-provisioned-products-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProvisionedProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProvisionedProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest request]
    (-> this (.searchProvisionedProductsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSServiceCatalogAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest request]
    (-> this (.createProductAsync request))))

(defn provision-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ProvisionProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ProvisionProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ProvisionProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.provisionProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest request]
    (-> this (.provisionProductAsync request))))

(defn delete-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest request]
    (-> this (.deleteServiceActionAsync request))))

(defn list-portfolios-for-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfoliosForProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfoliosForProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest request]
    (-> this (.listPortfoliosForProductAsync request))))

(defn create-tag-option-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest request]
    (-> this (.createTagOptionAsync request))))

(defn list-principals-for-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalsForPortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalsForPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest request]
    (-> this (.listPrincipalsForPortfolioAsync request))))

(defn disassociate-budget-from-resource-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateBudgetFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateBudgetFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest request]
    (-> this (.disassociateBudgetFromResourceAsync request))))

(defn list-portfolio-access-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfolioAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfolioAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest request]
    (-> this (.listPortfolioAccessAsync request))))

(defn list-portfolios-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfolios operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfoliosResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfoliosAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest request]
    (-> this (.listPortfoliosAsync request))))

(defn list-budgets-for-resource-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBudgetsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBudgetsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest request]
    (-> this (.listBudgetsForResourceAsync request))))

(defn associate-service-action-with-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceActionWithProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceActionWithProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.associateServiceActionWithProvisioningArtifactAsync request))))

(defn associate-tag-option-with-resource-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTagOptionWithResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTagOptionWithResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest request]
    (-> this (.associateTagOptionWithResourceAsync request))))

(defn describe-provisioned-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisionedProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest request]
    (-> this (.describeProvisionedProductAsync request))))

(defn delete-constraint-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConstraintAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest request]
    (-> this (.deleteConstraintAsync request))))

(defn list-launch-paths-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLaunchPaths operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLaunchPathsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest request]
    (-> this (.listLaunchPathsAsync request))))

(defn describe-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest request]
    (-> this (.describePortfolioAsync request))))

(defn disassociate-principal-from-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePrincipalFromPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePrincipalFromPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest request]
    (-> this (.disassociatePrincipalFromPortfolioAsync request))))

(defn execute-provisioned-product-plan-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeProvisionedProductPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest request]
    (-> this (.executeProvisionedProductPlanAsync request))))

(defn list-organization-portfolio-access-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizationPortfolioAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationPortfolioAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest request]
    (-> this (.listOrganizationPortfolioAccessAsync request))))

(defn list-resources-for-tag-option-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourcesForTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesForTagOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest request]
    (-> this (.listResourcesForTagOptionAsync request))))

(defn update-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest request]
    (-> this (.updateProvisioningArtifactAsync request))))

(defn describe-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest request]
    (-> this (.describeServiceActionAsync request))))

(defn list-service-actions-for-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceActionsForProvisioningArtifact operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceActionsForProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest request]
    (-> this (.listServiceActionsForProvisioningArtifactAsync request))))

(defn list-tag-options-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListTagOptionsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest request]
    (-> this (.listTagOptionsAsync request))))

(defn list-stack-instances-for-provisioned-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackInstancesForProvisionedProduct operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackInstancesForProvisionedProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest request]
    (-> this (.listStackInstancesForProvisionedProductAsync request))))

(defn enable-aws-organizations-access-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAWSOrganizationsAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAWSOrganizationsAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest request]
    (-> this (.enableAWSOrganizationsAccessAsync request))))

(defn search-products-as-admin-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProductsAsAdminAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest request]
    (-> this (.searchProductsAsAdminAsync request))))

(defn accept-portfolio-share-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptPortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptPortfolioShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest request]
    (-> this (.acceptPortfolioShareAsync request))))

(defn create-portfolio-share-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPortfolioShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest request]
    (-> this (.createPortfolioShareAsync request))))

(defn associate-product-with-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateProductWithPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateProductWithPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest request]
    (-> this (.associateProductWithPortfolioAsync request))))

(defn terminate-provisioned-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateProvisionedProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest request]
    (-> this (.terminateProvisionedProductAsync request))))

(defn disassociate-product-from-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateProductFromPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateProductFromPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest request]
    (-> this (.disassociateProductFromPortfolioAsync request))))

(defn describe-provisioning-parameters-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisioningParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisioningParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest request]
    (-> this (.describeProvisioningParametersAsync request))))

(defn describe-record-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeRecordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecord operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeRecordResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecordAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest request]
    (-> this (.describeRecordAsync request))))

(defn get-aws-organizations-access-status-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAWSOrganizationsAccessStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAWSOrganizationsAccessStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest request]
    (-> this (.getAWSOrganizationsAccessStatusAsync request))))

(defn delete-tag-option-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest request]
    (-> this (.deleteTagOptionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSServiceCatalogAsyncClient this]
    (-> this (.shutdown))))

(defn describe-tag-option-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest request]
    (-> this (.describeTagOptionAsync request))))

(defn describe-provisioned-product-plan-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisionedProductPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest request]
    (-> this (.describeProvisionedProductPlanAsync request))))

(defn list-service-actions-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListServiceActionsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest request]
    (-> this (.listServiceActionsAsync request))))

(defn delete-portfolio-share-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePortfolioShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest request]
    (-> this (.deletePortfolioShareAsync request))))

(defn describe-product-as-admin-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductAsAdminAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest request]
    (-> this (.describeProductAsAdminAsync request))))

(defn update-provisioned-product-properties-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisionedProductProperties operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisionedProductPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest request]
    (-> this (.updateProvisionedProductPropertiesAsync request))))

(defn create-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest request]
    (-> this (.createProvisioningArtifactAsync request))))

(defn describe-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest request]
    (-> this (.describeProductAsync request))))

(defn execute-provisioned-product-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteProvisionedProductServiceAction operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeProvisionedProductServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest request]
    (-> this (.executeProvisionedProductServiceActionAsync request))))

(defn batch-associate-service-action-with-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchAssociateServiceActionWithProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifactAsync request))))

(defn delete-provisioned-product-plan-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProvisionedProductPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest request]
    (-> this (.deleteProvisionedProductPlanAsync request))))

(defn create-provisioned-product-plan-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProvisionedProductPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest request]
    (-> this (.createProvisionedProductPlanAsync request))))

(defn update-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest request]
    (-> this (.updateServiceActionAsync request))))

(defn copy-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CopyProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CopyProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest request]
    (-> this (.copyProductAsync request))))

(defn associate-principal-with-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePrincipalWithPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePrincipalWithPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest request]
    (-> this (.associatePrincipalWithPortfolioAsync request))))

(defn update-tag-option-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest request]
    (-> this (.updateTagOptionAsync request))))

(defn list-constraints-for-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConstraintsForPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest request]
    (-> this (.listConstraintsForPortfolioAsync request))))

(defn scan-provisioned-products-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ScanProvisionedProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanProvisionedProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest request]
    (-> this (.scanProvisionedProductsAsync request))))

(defn disable-aws-organizations-access-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAWSOrganizationsAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAWSOrganizationsAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest request]
    (-> this (.disableAWSOrganizationsAccessAsync request))))

(defn describe-service-action-execution-parameters-async
  "request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceActionExecutionParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceActionExecutionParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest request]
    (-> this (.describeServiceActionExecutionParametersAsync request))))

(defn associate-budget-with-resource-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateBudgetWithResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateBudgetWithResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest request]
    (-> this (.associateBudgetWithResourceAsync request))))

(defn create-constraint-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreateConstraintRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConstraintAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest request]
    (-> this (.createConstraintAsync request))))

(defn list-provisioning-artifacts-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisioningArtifactsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest request]
    (-> this (.listProvisioningArtifactsAsync request))))

(defn create-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreatePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest request]
    (-> this (.createPortfolioAsync request))))

(defn update-constraint-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConstraintAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest request]
    (-> this (.updateConstraintAsync request))))

(defn list-provisioning-artifacts-for-service-action-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisioningArtifactsForServiceAction operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisioningArtifactsForServiceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest request]
    (-> this (.listProvisioningArtifactsForServiceActionAsync request))))

(defn batch-disassociate-service-action-from-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisassociateServiceActionFromProvisioningArtifact
           operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifactAsync request))))

(defn list-provisioned-product-plans-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisionedProductPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisionedProductPlansAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest request]
    (-> this (.listProvisionedProductPlansAsync request))))

(defn delete-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeleteProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest request]
    (-> this (.deleteProductAsync request))))

(defn describe-provisioning-artifact-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisioningArtifact operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisioningArtifactAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest request]
    (-> this (.describeProvisioningArtifactAsync request))))

(defn update-provisioned-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisionedProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest request]
    (-> this (.updateProvisionedProductAsync request))))

(defn reject-portfolio-share-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectPortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectPortfolioShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest request]
    (-> this (.rejectPortfolioShareAsync request))))

(defn delete-portfolio-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeletePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePortfolioAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest request]
    (-> this (.deletePortfolioAsync request))))

(defn list-record-history-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecordHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecordHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest request]
    (-> this (.listRecordHistoryAsync request))))

(defn disassociate-tag-option-from-resource-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTagOptionFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTagOptionFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest request]
    (-> this (.disassociateTagOptionFromResourceAsync request))))

(defn update-product-async
  "Description copied from interface: AWSServiceCatalogAsync

  request - `com.amazonaws.services.servicecatalog.model.UpdateProductRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProductAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsyncClient this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest request]
    (-> this (.updateProductAsync request))))

