/**
 * InventoryItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InventoryItem  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String purchaseDescription;

    private java.lang.Boolean copyDescription;

    private org.mule.module.netsuite.api.internal.RecordRef expenseAccount;

    private java.util.Calendar dateConvertedToInv;

    private org.mule.module.netsuite.api.internal.ItemType originalItemType;

    private org.mule.module.netsuite.api.internal.ItemSubType originalItemSubtype;

    private org.mule.module.netsuite.api.internal.RecordRef cogsAccount;

    private java.lang.String salesDescription;

    private java.lang.Boolean includeChildren;

    private org.mule.module.netsuite.api.internal.RecordRef incomeAccount;

    private org.mule.module.netsuite.api.internal.RecordRef taxSchedule;

    private java.lang.Boolean isTaxable;

    private org.mule.module.netsuite.api.internal.ItemMatrixType matrixType;

    private org.mule.module.netsuite.api.internal.RecordRef assetAccount;

    private java.lang.Boolean matchBillToReceipt;

    private org.mule.module.netsuite.api.internal.RecordRef billQtyVarianceAcct;

    private org.mule.module.netsuite.api.internal.RecordRef billPriceVarianceAcct;

    private org.mule.module.netsuite.api.internal.RecordRef billExchRateVarianceAcct;

    private org.mule.module.netsuite.api.internal.RecordRef gainLossAccount;

    private java.lang.Double shippingCost;

    private java.lang.String shippingCostUnits;

    private java.lang.Double handlingCost;

    private java.lang.String handlingCostUnits;

    private java.lang.Double weight;

    private org.mule.module.netsuite.api.internal.ItemWeightUnit weightUnit;

    private java.lang.String weightUnits;

    private java.lang.String costingMethodDisplay;

    private org.mule.module.netsuite.api.internal.RecordRef unitsType;

    private org.mule.module.netsuite.api.internal.RecordRef stockUnit;

    private org.mule.module.netsuite.api.internal.RecordRef purchaseUnit;

    private org.mule.module.netsuite.api.internal.RecordRef saleUnit;

    private org.mule.module.netsuite.api.internal.RecordRef issueProduct;

    private org.mule.module.netsuite.api.internal.RecordRef billingSchedule;

    private java.lang.Boolean trackLandedCost;

    private java.lang.Boolean isDropShipItem;

    private java.lang.Boolean isSpecialOrderItem;

    private java.lang.String stockDescription;

    private org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount;

    private java.lang.Boolean producer;

    private java.lang.String manufacturer;

    private org.mule.module.netsuite.api.internal.RecordRef revRecSchedule;

    private java.lang.String mpn;

    private java.lang.Boolean multManufactureAddr;

    private java.lang.String manufacturerAddr1;

    private java.lang.String manufacturerCity;

    private java.lang.String manufacturerState;

    private java.lang.String manufacturerZip;

    private org.mule.module.netsuite.api.internal.Country countryOfManufacture;

    private java.lang.String manufacturerTaxId;

    private java.lang.String scheduleBNumber;

    private java.lang.Long scheduleBQuantity;

    private org.mule.module.netsuite.api.internal.ScheduleBCode scheduleBCode;

    private java.lang.String manufacturerTariff;

    private org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion;

    private java.lang.Long minimumQuantity;

    private java.lang.Boolean enforceMinQtyInternally;

    private java.lang.String minimumQuantityUnits;

    private org.mule.module.netsuite.api.internal.RecordRef softDescriptor;

    private org.mule.module.netsuite.api.internal.RecordRef shipPackage;

    private java.lang.Boolean shipIndividually;

    private java.lang.Boolean pricesIncludeTax;

    private org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule;

    private java.lang.String reorderPointUnits;

    private java.lang.Boolean useMarginalRates;

    private java.lang.String preferredStockLevelUnits;

    private org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private java.lang.Double transferPrice;

    private org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType;

    private org.mule.module.netsuite.api.internal.RecordRef pricingGroup;

    private java.lang.Double vsoePrice;

    private java.lang.String costEstimateUnits;

    private org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral;

    private org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private org.mule.module.netsuite.api.internal.RecordRef preferredLocation;

    private java.lang.Long reorderMultiple;

    private java.lang.Double cost;

    private java.lang.String costUnits;

    private java.lang.Double totalValue;

    private java.lang.Double averageCost;

    private java.lang.Boolean useBins;

    private java.lang.String quantityReorderUnits;

    private java.lang.Long leadTime;

    private java.lang.Boolean autoLeadTime;

    private java.lang.Double lastPurchasePrice;

    private java.lang.Boolean autoPreferredStockLevel;

    private java.lang.Double preferredStockLevelDays;

    private java.lang.Double safetyStockLevel;

    private java.lang.Long safetyStockLevelDays;

    private java.lang.Boolean seasonalDemand;

    private java.lang.String safetyStockLevelUnits;

    private java.lang.Double demandModifier;

    private java.lang.Boolean autoReorderPoint;

    private java.lang.String storeDisplayName;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage;

    private java.lang.String storeDescription;

    private java.lang.String storeDetailedDescription;

    private org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate;

    private java.lang.String pageTitle;

    private java.lang.String metaTagHtml;

    private java.lang.Boolean excludeFromSitemap;

    private org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority;

    private java.lang.String searchKeywords;

    private java.lang.Boolean isDonationItem;

    private java.lang.Boolean showDefaultDonationAmount;

    private java.lang.Double maxDonationAmount;

    private java.lang.Boolean dontShowPrice;

    private java.lang.String noPriceMessage;

    private java.lang.String outOfStockMessage;

    private java.lang.Boolean onSpecial;

    private org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior;

    private java.lang.String relatedItemsDescription;

    private java.lang.String specialsDescription;

    private java.lang.String featuredDescription;

    private java.lang.String shoppingDotComCategory;

    private java.lang.Long shopzillaCategoryId;

    private java.lang.String nexTagCategory;

    private java.lang.String urlComponent;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private java.lang.String vendorName;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isGcoCompliant;

    private java.lang.Boolean offerSupport;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean availableToPartners;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.ItemCostingMethod costingMethod;

    private java.lang.String currency;

    private java.lang.Double preferredStockLevel;

    private org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix;

    private org.mule.module.netsuite.api.internal.RecordRef purchaseTaxCode;

    private java.lang.Double defaultReturnCost;

    private java.lang.Double quantityBackOrdered;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityAvailable;

    private java.lang.Double quantityOnHand;

    private java.lang.Double onHandValueMli;

    private java.lang.Double quantityOnOrder;

    private java.lang.Double rate;

    private java.lang.Double reorderPoint;

    private java.lang.String quantityCommittedUnits;

    private org.mule.module.netsuite.api.internal.RecordRef salesTaxCode;

    private java.lang.String quantityAvailableUnits;

    private java.lang.String quantityOnHandUnits;

    private org.mule.module.netsuite.api.internal.RecordRef vendor;

    private java.lang.String quantityOnOrderUnits;

    private org.mule.module.netsuite.api.internal.ProductFeedList productFeedList;

    private org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList;

    private org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList;

    private org.mule.module.netsuite.api.internal.ItemVendorList itemVendorList;

    private org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList;

    private org.mule.module.netsuite.api.internal.TranslationList translationsList;

    private org.mule.module.netsuite.api.internal.InventoryItemBinNumberList binNumberList;

    private org.mule.module.netsuite.api.internal.InventoryItemLocationsList locationsList;

    private org.mule.module.netsuite.api.internal.MatrixOptionList matrixOptionList;

    private org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public InventoryItem() {
    }

    public InventoryItem(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String purchaseDescription,
           java.lang.Boolean copyDescription,
           org.mule.module.netsuite.api.internal.RecordRef expenseAccount,
           java.util.Calendar dateConvertedToInv,
           org.mule.module.netsuite.api.internal.ItemType originalItemType,
           org.mule.module.netsuite.api.internal.ItemSubType originalItemSubtype,
           org.mule.module.netsuite.api.internal.RecordRef cogsAccount,
           java.lang.String salesDescription,
           java.lang.Boolean includeChildren,
           org.mule.module.netsuite.api.internal.RecordRef incomeAccount,
           org.mule.module.netsuite.api.internal.RecordRef taxSchedule,
           java.lang.Boolean isTaxable,
           org.mule.module.netsuite.api.internal.ItemMatrixType matrixType,
           org.mule.module.netsuite.api.internal.RecordRef assetAccount,
           java.lang.Boolean matchBillToReceipt,
           org.mule.module.netsuite.api.internal.RecordRef billQtyVarianceAcct,
           org.mule.module.netsuite.api.internal.RecordRef billPriceVarianceAcct,
           org.mule.module.netsuite.api.internal.RecordRef billExchRateVarianceAcct,
           org.mule.module.netsuite.api.internal.RecordRef gainLossAccount,
           java.lang.Double shippingCost,
           java.lang.String shippingCostUnits,
           java.lang.Double handlingCost,
           java.lang.String handlingCostUnits,
           java.lang.Double weight,
           org.mule.module.netsuite.api.internal.ItemWeightUnit weightUnit,
           java.lang.String weightUnits,
           java.lang.String costingMethodDisplay,
           org.mule.module.netsuite.api.internal.RecordRef unitsType,
           org.mule.module.netsuite.api.internal.RecordRef stockUnit,
           org.mule.module.netsuite.api.internal.RecordRef purchaseUnit,
           org.mule.module.netsuite.api.internal.RecordRef saleUnit,
           org.mule.module.netsuite.api.internal.RecordRef issueProduct,
           org.mule.module.netsuite.api.internal.RecordRef billingSchedule,
           java.lang.Boolean trackLandedCost,
           java.lang.Boolean isDropShipItem,
           java.lang.Boolean isSpecialOrderItem,
           java.lang.String stockDescription,
           org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount,
           java.lang.Boolean producer,
           java.lang.String manufacturer,
           org.mule.module.netsuite.api.internal.RecordRef revRecSchedule,
           java.lang.String mpn,
           java.lang.Boolean multManufactureAddr,
           java.lang.String manufacturerAddr1,
           java.lang.String manufacturerCity,
           java.lang.String manufacturerState,
           java.lang.String manufacturerZip,
           org.mule.module.netsuite.api.internal.Country countryOfManufacture,
           java.lang.String manufacturerTaxId,
           java.lang.String scheduleBNumber,
           java.lang.Long scheduleBQuantity,
           org.mule.module.netsuite.api.internal.ScheduleBCode scheduleBCode,
           java.lang.String manufacturerTariff,
           org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion,
           java.lang.Long minimumQuantity,
           java.lang.Boolean enforceMinQtyInternally,
           java.lang.String minimumQuantityUnits,
           org.mule.module.netsuite.api.internal.RecordRef softDescriptor,
           org.mule.module.netsuite.api.internal.RecordRef shipPackage,
           java.lang.Boolean shipIndividually,
           java.lang.Boolean pricesIncludeTax,
           org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule,
           java.lang.String reorderPointUnits,
           java.lang.Boolean useMarginalRates,
           java.lang.String preferredStockLevelUnits,
           org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           java.lang.Double transferPrice,
           org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType,
           org.mule.module.netsuite.api.internal.RecordRef pricingGroup,
           java.lang.Double vsoePrice,
           java.lang.String costEstimateUnits,
           org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral,
           org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           org.mule.module.netsuite.api.internal.RecordRef preferredLocation,
           java.lang.Long reorderMultiple,
           java.lang.Double cost,
           java.lang.String costUnits,
           java.lang.Double totalValue,
           java.lang.Double averageCost,
           java.lang.Boolean useBins,
           java.lang.String quantityReorderUnits,
           java.lang.Long leadTime,
           java.lang.Boolean autoLeadTime,
           java.lang.Double lastPurchasePrice,
           java.lang.Boolean autoPreferredStockLevel,
           java.lang.Double preferredStockLevelDays,
           java.lang.Double safetyStockLevel,
           java.lang.Long safetyStockLevelDays,
           java.lang.Boolean seasonalDemand,
           java.lang.String safetyStockLevelUnits,
           java.lang.Double demandModifier,
           java.lang.Boolean autoReorderPoint,
           java.lang.String storeDisplayName,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage,
           java.lang.String storeDescription,
           java.lang.String storeDetailedDescription,
           org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate,
           java.lang.String pageTitle,
           java.lang.String metaTagHtml,
           java.lang.Boolean excludeFromSitemap,
           org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority,
           java.lang.String searchKeywords,
           java.lang.Boolean isDonationItem,
           java.lang.Boolean showDefaultDonationAmount,
           java.lang.Double maxDonationAmount,
           java.lang.Boolean dontShowPrice,
           java.lang.String noPriceMessage,
           java.lang.String outOfStockMessage,
           java.lang.Boolean onSpecial,
           org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior,
           java.lang.String relatedItemsDescription,
           java.lang.String specialsDescription,
           java.lang.String featuredDescription,
           java.lang.String shoppingDotComCategory,
           java.lang.Long shopzillaCategoryId,
           java.lang.String nexTagCategory,
           java.lang.String urlComponent,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           java.lang.String vendorName,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean isOnline,
           java.lang.Boolean isGcoCompliant,
           java.lang.Boolean offerSupport,
           java.lang.Boolean isInactive,
           java.lang.Boolean availableToPartners,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.ItemCostingMethod costingMethod,
           java.lang.String currency,
           java.lang.Double preferredStockLevel,
           org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix,
           org.mule.module.netsuite.api.internal.RecordRef purchaseTaxCode,
           java.lang.Double defaultReturnCost,
           java.lang.Double quantityBackOrdered,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityAvailable,
           java.lang.Double quantityOnHand,
           java.lang.Double onHandValueMli,
           java.lang.Double quantityOnOrder,
           java.lang.Double rate,
           java.lang.Double reorderPoint,
           java.lang.String quantityCommittedUnits,
           org.mule.module.netsuite.api.internal.RecordRef salesTaxCode,
           java.lang.String quantityAvailableUnits,
           java.lang.String quantityOnHandUnits,
           org.mule.module.netsuite.api.internal.RecordRef vendor,
           java.lang.String quantityOnOrderUnits,
           org.mule.module.netsuite.api.internal.ProductFeedList productFeedList,
           org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList,
           org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList,
           org.mule.module.netsuite.api.internal.ItemVendorList itemVendorList,
           org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList,
           org.mule.module.netsuite.api.internal.TranslationList translationsList,
           org.mule.module.netsuite.api.internal.InventoryItemBinNumberList binNumberList,
           org.mule.module.netsuite.api.internal.InventoryItemLocationsList locationsList,
           org.mule.module.netsuite.api.internal.MatrixOptionList matrixOptionList,
           org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.purchaseDescription = purchaseDescription;
        this.copyDescription = copyDescription;
        this.expenseAccount = expenseAccount;
        this.dateConvertedToInv = dateConvertedToInv;
        this.originalItemType = originalItemType;
        this.originalItemSubtype = originalItemSubtype;
        this.cogsAccount = cogsAccount;
        this.salesDescription = salesDescription;
        this.includeChildren = includeChildren;
        this.incomeAccount = incomeAccount;
        this.taxSchedule = taxSchedule;
        this.isTaxable = isTaxable;
        this.matrixType = matrixType;
        this.assetAccount = assetAccount;
        this.matchBillToReceipt = matchBillToReceipt;
        this.billQtyVarianceAcct = billQtyVarianceAcct;
        this.billPriceVarianceAcct = billPriceVarianceAcct;
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
        this.gainLossAccount = gainLossAccount;
        this.shippingCost = shippingCost;
        this.shippingCostUnits = shippingCostUnits;
        this.handlingCost = handlingCost;
        this.handlingCostUnits = handlingCostUnits;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.weightUnits = weightUnits;
        this.costingMethodDisplay = costingMethodDisplay;
        this.unitsType = unitsType;
        this.stockUnit = stockUnit;
        this.purchaseUnit = purchaseUnit;
        this.saleUnit = saleUnit;
        this.issueProduct = issueProduct;
        this.billingSchedule = billingSchedule;
        this.trackLandedCost = trackLandedCost;
        this.isDropShipItem = isDropShipItem;
        this.isSpecialOrderItem = isSpecialOrderItem;
        this.stockDescription = stockDescription;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.producer = producer;
        this.manufacturer = manufacturer;
        this.revRecSchedule = revRecSchedule;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.manufacturerAddr1 = manufacturerAddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerZip = manufacturerZip;
        this.countryOfManufacture = countryOfManufacture;
        this.manufacturerTaxId = manufacturerTaxId;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.scheduleBCode = scheduleBCode;
        this.manufacturerTariff = manufacturerTariff;
        this.preferenceCriterion = preferenceCriterion;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.minimumQuantityUnits = minimumQuantityUnits;
        this.softDescriptor = softDescriptor;
        this.shipPackage = shipPackage;
        this.shipIndividually = shipIndividually;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.reorderPointUnits = reorderPointUnits;
        this.useMarginalRates = useMarginalRates;
        this.preferredStockLevelUnits = preferredStockLevelUnits;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.transferPrice = transferPrice;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.vsoePrice = vsoePrice;
        this.costEstimateUnits = costEstimateUnits;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.preferredLocation = preferredLocation;
        this.reorderMultiple = reorderMultiple;
        this.cost = cost;
        this.costUnits = costUnits;
        this.totalValue = totalValue;
        this.averageCost = averageCost;
        this.useBins = useBins;
        this.quantityReorderUnits = quantityReorderUnits;
        this.leadTime = leadTime;
        this.autoLeadTime = autoLeadTime;
        this.lastPurchasePrice = lastPurchasePrice;
        this.autoPreferredStockLevel = autoPreferredStockLevel;
        this.preferredStockLevelDays = preferredStockLevelDays;
        this.safetyStockLevel = safetyStockLevel;
        this.safetyStockLevelDays = safetyStockLevelDays;
        this.seasonalDemand = seasonalDemand;
        this.safetyStockLevelUnits = safetyStockLevelUnits;
        this.demandModifier = demandModifier;
        this.autoReorderPoint = autoReorderPoint;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.outOfStockMessage = outOfStockMessage;
        this.onSpecial = onSpecial;
        this.outOfStockBehavior = outOfStockBehavior;
        this.relatedItemsDescription = relatedItemsDescription;
        this.specialsDescription = specialsDescription;
        this.featuredDescription = featuredDescription;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.nexTagCategory = nexTagCategory;
        this.urlComponent = urlComponent;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.costingMethod = costingMethod;
        this.currency = currency;
        this.preferredStockLevel = preferredStockLevel;
        this.pricingMatrix = pricingMatrix;
        this.purchaseTaxCode = purchaseTaxCode;
        this.defaultReturnCost = defaultReturnCost;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCommitted = quantityCommitted;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
        this.onHandValueMli = onHandValueMli;
        this.quantityOnOrder = quantityOnOrder;
        this.rate = rate;
        this.reorderPoint = reorderPoint;
        this.quantityCommittedUnits = quantityCommittedUnits;
        this.salesTaxCode = salesTaxCode;
        this.quantityAvailableUnits = quantityAvailableUnits;
        this.quantityOnHandUnits = quantityOnHandUnits;
        this.vendor = vendor;
        this.quantityOnOrderUnits = quantityOnOrderUnits;
        this.productFeedList = productFeedList;
        this.subsidiaryList = subsidiaryList;
        this.itemOptionsList = itemOptionsList;
        this.itemVendorList = itemVendorList;
        this.siteCategoryList = siteCategoryList;
        this.translationsList = translationsList;
        this.binNumberList = binNumberList;
        this.locationsList = locationsList;
        this.matrixOptionList = matrixOptionList;
        this.presentationItemList = presentationItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this InventoryItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InventoryItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this InventoryItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this InventoryItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the purchaseDescription value for this InventoryItem.
     * 
     * @return purchaseDescription
     */
    public java.lang.String getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this InventoryItem.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(java.lang.String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }


    /**
     * Gets the copyDescription value for this InventoryItem.
     * 
     * @return copyDescription
     */
    public java.lang.Boolean getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this InventoryItem.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(java.lang.Boolean copyDescription) {
        this.copyDescription = copyDescription;
    }


    /**
     * Gets the expenseAccount value for this InventoryItem.
     * 
     * @return expenseAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this InventoryItem.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(org.mule.module.netsuite.api.internal.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the dateConvertedToInv value for this InventoryItem.
     * 
     * @return dateConvertedToInv
     */
    public java.util.Calendar getDateConvertedToInv() {
        return dateConvertedToInv;
    }


    /**
     * Sets the dateConvertedToInv value for this InventoryItem.
     * 
     * @param dateConvertedToInv
     */
    public void setDateConvertedToInv(java.util.Calendar dateConvertedToInv) {
        this.dateConvertedToInv = dateConvertedToInv;
    }


    /**
     * Gets the originalItemType value for this InventoryItem.
     * 
     * @return originalItemType
     */
    public org.mule.module.netsuite.api.internal.ItemType getOriginalItemType() {
        return originalItemType;
    }


    /**
     * Sets the originalItemType value for this InventoryItem.
     * 
     * @param originalItemType
     */
    public void setOriginalItemType(org.mule.module.netsuite.api.internal.ItemType originalItemType) {
        this.originalItemType = originalItemType;
    }


    /**
     * Gets the originalItemSubtype value for this InventoryItem.
     * 
     * @return originalItemSubtype
     */
    public org.mule.module.netsuite.api.internal.ItemSubType getOriginalItemSubtype() {
        return originalItemSubtype;
    }


    /**
     * Sets the originalItemSubtype value for this InventoryItem.
     * 
     * @param originalItemSubtype
     */
    public void setOriginalItemSubtype(org.mule.module.netsuite.api.internal.ItemSubType originalItemSubtype) {
        this.originalItemSubtype = originalItemSubtype;
    }


    /**
     * Gets the cogsAccount value for this InventoryItem.
     * 
     * @return cogsAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCogsAccount() {
        return cogsAccount;
    }


    /**
     * Sets the cogsAccount value for this InventoryItem.
     * 
     * @param cogsAccount
     */
    public void setCogsAccount(org.mule.module.netsuite.api.internal.RecordRef cogsAccount) {
        this.cogsAccount = cogsAccount;
    }


    /**
     * Gets the salesDescription value for this InventoryItem.
     * 
     * @return salesDescription
     */
    public java.lang.String getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this InventoryItem.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(java.lang.String salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the includeChildren value for this InventoryItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this InventoryItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the incomeAccount value for this InventoryItem.
     * 
     * @return incomeAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this InventoryItem.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(org.mule.module.netsuite.api.internal.RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the taxSchedule value for this InventoryItem.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this InventoryItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the isTaxable value for this InventoryItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this InventoryItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the matrixType value for this InventoryItem.
     * 
     * @return matrixType
     */
    public org.mule.module.netsuite.api.internal.ItemMatrixType getMatrixType() {
        return matrixType;
    }


    /**
     * Sets the matrixType value for this InventoryItem.
     * 
     * @param matrixType
     */
    public void setMatrixType(org.mule.module.netsuite.api.internal.ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }


    /**
     * Gets the assetAccount value for this InventoryItem.
     * 
     * @return assetAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAssetAccount() {
        return assetAccount;
    }


    /**
     * Sets the assetAccount value for this InventoryItem.
     * 
     * @param assetAccount
     */
    public void setAssetAccount(org.mule.module.netsuite.api.internal.RecordRef assetAccount) {
        this.assetAccount = assetAccount;
    }


    /**
     * Gets the matchBillToReceipt value for this InventoryItem.
     * 
     * @return matchBillToReceipt
     */
    public java.lang.Boolean getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this InventoryItem.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(java.lang.Boolean matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }


    /**
     * Gets the billQtyVarianceAcct value for this InventoryItem.
     * 
     * @return billQtyVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillQtyVarianceAcct() {
        return billQtyVarianceAcct;
    }


    /**
     * Sets the billQtyVarianceAcct value for this InventoryItem.
     * 
     * @param billQtyVarianceAcct
     */
    public void setBillQtyVarianceAcct(org.mule.module.netsuite.api.internal.RecordRef billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }


    /**
     * Gets the billPriceVarianceAcct value for this InventoryItem.
     * 
     * @return billPriceVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillPriceVarianceAcct() {
        return billPriceVarianceAcct;
    }


    /**
     * Sets the billPriceVarianceAcct value for this InventoryItem.
     * 
     * @param billPriceVarianceAcct
     */
    public void setBillPriceVarianceAcct(org.mule.module.netsuite.api.internal.RecordRef billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }


    /**
     * Gets the billExchRateVarianceAcct value for this InventoryItem.
     * 
     * @return billExchRateVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillExchRateVarianceAcct() {
        return billExchRateVarianceAcct;
    }


    /**
     * Sets the billExchRateVarianceAcct value for this InventoryItem.
     * 
     * @param billExchRateVarianceAcct
     */
    public void setBillExchRateVarianceAcct(org.mule.module.netsuite.api.internal.RecordRef billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }


    /**
     * Gets the gainLossAccount value for this InventoryItem.
     * 
     * @return gainLossAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getGainLossAccount() {
        return gainLossAccount;
    }


    /**
     * Sets the gainLossAccount value for this InventoryItem.
     * 
     * @param gainLossAccount
     */
    public void setGainLossAccount(org.mule.module.netsuite.api.internal.RecordRef gainLossAccount) {
        this.gainLossAccount = gainLossAccount;
    }


    /**
     * Gets the shippingCost value for this InventoryItem.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this InventoryItem.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingCostUnits value for this InventoryItem.
     * 
     * @return shippingCostUnits
     */
    public java.lang.String getShippingCostUnits() {
        return shippingCostUnits;
    }


    /**
     * Sets the shippingCostUnits value for this InventoryItem.
     * 
     * @param shippingCostUnits
     */
    public void setShippingCostUnits(java.lang.String shippingCostUnits) {
        this.shippingCostUnits = shippingCostUnits;
    }


    /**
     * Gets the handlingCost value for this InventoryItem.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this InventoryItem.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the handlingCostUnits value for this InventoryItem.
     * 
     * @return handlingCostUnits
     */
    public java.lang.String getHandlingCostUnits() {
        return handlingCostUnits;
    }


    /**
     * Sets the handlingCostUnits value for this InventoryItem.
     * 
     * @param handlingCostUnits
     */
    public void setHandlingCostUnits(java.lang.String handlingCostUnits) {
        this.handlingCostUnits = handlingCostUnits;
    }


    /**
     * Gets the weight value for this InventoryItem.
     * 
     * @return weight
     */
    public java.lang.Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this InventoryItem.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }


    /**
     * Gets the weightUnit value for this InventoryItem.
     * 
     * @return weightUnit
     */
    public org.mule.module.netsuite.api.internal.ItemWeightUnit getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this InventoryItem.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(org.mule.module.netsuite.api.internal.ItemWeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the weightUnits value for this InventoryItem.
     * 
     * @return weightUnits
     */
    public java.lang.String getWeightUnits() {
        return weightUnits;
    }


    /**
     * Sets the weightUnits value for this InventoryItem.
     * 
     * @param weightUnits
     */
    public void setWeightUnits(java.lang.String weightUnits) {
        this.weightUnits = weightUnits;
    }


    /**
     * Gets the costingMethodDisplay value for this InventoryItem.
     * 
     * @return costingMethodDisplay
     */
    public java.lang.String getCostingMethodDisplay() {
        return costingMethodDisplay;
    }


    /**
     * Sets the costingMethodDisplay value for this InventoryItem.
     * 
     * @param costingMethodDisplay
     */
    public void setCostingMethodDisplay(java.lang.String costingMethodDisplay) {
        this.costingMethodDisplay = costingMethodDisplay;
    }


    /**
     * Gets the unitsType value for this InventoryItem.
     * 
     * @return unitsType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this InventoryItem.
     * 
     * @param unitsType
     */
    public void setUnitsType(org.mule.module.netsuite.api.internal.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the stockUnit value for this InventoryItem.
     * 
     * @return stockUnit
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStockUnit() {
        return stockUnit;
    }


    /**
     * Sets the stockUnit value for this InventoryItem.
     * 
     * @param stockUnit
     */
    public void setStockUnit(org.mule.module.netsuite.api.internal.RecordRef stockUnit) {
        this.stockUnit = stockUnit;
    }


    /**
     * Gets the purchaseUnit value for this InventoryItem.
     * 
     * @return purchaseUnit
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this InventoryItem.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(org.mule.module.netsuite.api.internal.RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the saleUnit value for this InventoryItem.
     * 
     * @return saleUnit
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this InventoryItem.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(org.mule.module.netsuite.api.internal.RecordRef saleUnit) {
        this.saleUnit = saleUnit;
    }


    /**
     * Gets the issueProduct value for this InventoryItem.
     * 
     * @return issueProduct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this InventoryItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(org.mule.module.netsuite.api.internal.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the billingSchedule value for this InventoryItem.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this InventoryItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the trackLandedCost value for this InventoryItem.
     * 
     * @return trackLandedCost
     */
    public java.lang.Boolean getTrackLandedCost() {
        return trackLandedCost;
    }


    /**
     * Sets the trackLandedCost value for this InventoryItem.
     * 
     * @param trackLandedCost
     */
    public void setTrackLandedCost(java.lang.Boolean trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }


    /**
     * Gets the isDropShipItem value for this InventoryItem.
     * 
     * @return isDropShipItem
     */
    public java.lang.Boolean getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this InventoryItem.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(java.lang.Boolean isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }


    /**
     * Gets the isSpecialOrderItem value for this InventoryItem.
     * 
     * @return isSpecialOrderItem
     */
    public java.lang.Boolean getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this InventoryItem.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(java.lang.Boolean isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }


    /**
     * Gets the stockDescription value for this InventoryItem.
     * 
     * @return stockDescription
     */
    public java.lang.String getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this InventoryItem.
     * 
     * @param stockDescription
     */
    public void setStockDescription(java.lang.String stockDescription) {
        this.stockDescription = stockDescription;
    }


    /**
     * Gets the deferredRevenueAccount value for this InventoryItem.
     * 
     * @return deferredRevenueAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this InventoryItem.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }


    /**
     * Gets the producer value for this InventoryItem.
     * 
     * @return producer
     */
    public java.lang.Boolean getProducer() {
        return producer;
    }


    /**
     * Sets the producer value for this InventoryItem.
     * 
     * @param producer
     */
    public void setProducer(java.lang.Boolean producer) {
        this.producer = producer;
    }


    /**
     * Gets the manufacturer value for this InventoryItem.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this InventoryItem.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the revRecSchedule value for this InventoryItem.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this InventoryItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the mpn value for this InventoryItem.
     * 
     * @return mpn
     */
    public java.lang.String getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this InventoryItem.
     * 
     * @param mpn
     */
    public void setMpn(java.lang.String mpn) {
        this.mpn = mpn;
    }


    /**
     * Gets the multManufactureAddr value for this InventoryItem.
     * 
     * @return multManufactureAddr
     */
    public java.lang.Boolean getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this InventoryItem.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(java.lang.Boolean multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }


    /**
     * Gets the manufacturerAddr1 value for this InventoryItem.
     * 
     * @return manufacturerAddr1
     */
    public java.lang.String getManufacturerAddr1() {
        return manufacturerAddr1;
    }


    /**
     * Sets the manufacturerAddr1 value for this InventoryItem.
     * 
     * @param manufacturerAddr1
     */
    public void setManufacturerAddr1(java.lang.String manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }


    /**
     * Gets the manufacturerCity value for this InventoryItem.
     * 
     * @return manufacturerCity
     */
    public java.lang.String getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this InventoryItem.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(java.lang.String manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }


    /**
     * Gets the manufacturerState value for this InventoryItem.
     * 
     * @return manufacturerState
     */
    public java.lang.String getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this InventoryItem.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(java.lang.String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }


    /**
     * Gets the manufacturerZip value for this InventoryItem.
     * 
     * @return manufacturerZip
     */
    public java.lang.String getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this InventoryItem.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(java.lang.String manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }


    /**
     * Gets the countryOfManufacture value for this InventoryItem.
     * 
     * @return countryOfManufacture
     */
    public org.mule.module.netsuite.api.internal.Country getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this InventoryItem.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(org.mule.module.netsuite.api.internal.Country countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the manufacturerTaxId value for this InventoryItem.
     * 
     * @return manufacturerTaxId
     */
    public java.lang.String getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this InventoryItem.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(java.lang.String manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }


    /**
     * Gets the scheduleBNumber value for this InventoryItem.
     * 
     * @return scheduleBNumber
     */
    public java.lang.String getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this InventoryItem.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(java.lang.String scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }


    /**
     * Gets the scheduleBQuantity value for this InventoryItem.
     * 
     * @return scheduleBQuantity
     */
    public java.lang.Long getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this InventoryItem.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(java.lang.Long scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }


    /**
     * Gets the scheduleBCode value for this InventoryItem.
     * 
     * @return scheduleBCode
     */
    public org.mule.module.netsuite.api.internal.ScheduleBCode getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this InventoryItem.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(org.mule.module.netsuite.api.internal.ScheduleBCode scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }


    /**
     * Gets the manufacturerTariff value for this InventoryItem.
     * 
     * @return manufacturerTariff
     */
    public java.lang.String getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this InventoryItem.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(java.lang.String manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }


    /**
     * Gets the preferenceCriterion value for this InventoryItem.
     * 
     * @return preferenceCriterion
     */
    public org.mule.module.netsuite.api.internal.ItemPreferenceCriterion getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this InventoryItem.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }


    /**
     * Gets the minimumQuantity value for this InventoryItem.
     * 
     * @return minimumQuantity
     */
    public java.lang.Long getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this InventoryItem.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(java.lang.Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the enforceMinQtyInternally value for this InventoryItem.
     * 
     * @return enforceMinQtyInternally
     */
    public java.lang.Boolean getEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }


    /**
     * Sets the enforceMinQtyInternally value for this InventoryItem.
     * 
     * @param enforceMinQtyInternally
     */
    public void setEnforceMinQtyInternally(java.lang.Boolean enforceMinQtyInternally) {
        this.enforceMinQtyInternally = enforceMinQtyInternally;
    }


    /**
     * Gets the minimumQuantityUnits value for this InventoryItem.
     * 
     * @return minimumQuantityUnits
     */
    public java.lang.String getMinimumQuantityUnits() {
        return minimumQuantityUnits;
    }


    /**
     * Sets the minimumQuantityUnits value for this InventoryItem.
     * 
     * @param minimumQuantityUnits
     */
    public void setMinimumQuantityUnits(java.lang.String minimumQuantityUnits) {
        this.minimumQuantityUnits = minimumQuantityUnits;
    }


    /**
     * Gets the softDescriptor value for this InventoryItem.
     * 
     * @return softDescriptor
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this InventoryItem.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(org.mule.module.netsuite.api.internal.RecordRef softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the shipPackage value for this InventoryItem.
     * 
     * @return shipPackage
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this InventoryItem.
     * 
     * @param shipPackage
     */
    public void setShipPackage(org.mule.module.netsuite.api.internal.RecordRef shipPackage) {
        this.shipPackage = shipPackage;
    }


    /**
     * Gets the shipIndividually value for this InventoryItem.
     * 
     * @return shipIndividually
     */
    public java.lang.Boolean getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this InventoryItem.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(java.lang.Boolean shipIndividually) {
        this.shipIndividually = shipIndividually;
    }


    /**
     * Gets the pricesIncludeTax value for this InventoryItem.
     * 
     * @return pricesIncludeTax
     */
    public java.lang.Boolean getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this InventoryItem.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(java.lang.Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the quantityPricingSchedule value for this InventoryItem.
     * 
     * @return quantityPricingSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this InventoryItem.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the reorderPointUnits value for this InventoryItem.
     * 
     * @return reorderPointUnits
     */
    public java.lang.String getReorderPointUnits() {
        return reorderPointUnits;
    }


    /**
     * Sets the reorderPointUnits value for this InventoryItem.
     * 
     * @param reorderPointUnits
     */
    public void setReorderPointUnits(java.lang.String reorderPointUnits) {
        this.reorderPointUnits = reorderPointUnits;
    }


    /**
     * Gets the useMarginalRates value for this InventoryItem.
     * 
     * @return useMarginalRates
     */
    public java.lang.Boolean getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this InventoryItem.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(java.lang.Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the preferredStockLevelUnits value for this InventoryItem.
     * 
     * @return preferredStockLevelUnits
     */
    public java.lang.String getPreferredStockLevelUnits() {
        return preferredStockLevelUnits;
    }


    /**
     * Sets the preferredStockLevelUnits value for this InventoryItem.
     * 
     * @param preferredStockLevelUnits
     */
    public void setPreferredStockLevelUnits(java.lang.String preferredStockLevelUnits) {
        this.preferredStockLevelUnits = preferredStockLevelUnits;
    }


    /**
     * Gets the costEstimateType value for this InventoryItem.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this InventoryItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this InventoryItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this InventoryItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the transferPrice value for this InventoryItem.
     * 
     * @return transferPrice
     */
    public java.lang.Double getTransferPrice() {
        return transferPrice;
    }


    /**
     * Sets the transferPrice value for this InventoryItem.
     * 
     * @param transferPrice
     */
    public void setTransferPrice(java.lang.Double transferPrice) {
        this.transferPrice = transferPrice;
    }


    /**
     * Gets the overallQuantityPricingType value for this InventoryItem.
     * 
     * @return overallQuantityPricingType
     */
    public org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this InventoryItem.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the pricingGroup value for this InventoryItem.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this InventoryItem.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.RecordRef pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the vsoePrice value for this InventoryItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this InventoryItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the costEstimateUnits value for this InventoryItem.
     * 
     * @return costEstimateUnits
     */
    public java.lang.String getCostEstimateUnits() {
        return costEstimateUnits;
    }


    /**
     * Sets the costEstimateUnits value for this InventoryItem.
     * 
     * @param costEstimateUnits
     */
    public void setCostEstimateUnits(java.lang.String costEstimateUnits) {
        this.costEstimateUnits = costEstimateUnits;
    }


    /**
     * Gets the vsoeDeferral value for this InventoryItem.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this InventoryItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this InventoryItem.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this InventoryItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this InventoryItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this InventoryItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the preferredLocation value for this InventoryItem.
     * 
     * @return preferredLocation
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPreferredLocation() {
        return preferredLocation;
    }


    /**
     * Sets the preferredLocation value for this InventoryItem.
     * 
     * @param preferredLocation
     */
    public void setPreferredLocation(org.mule.module.netsuite.api.internal.RecordRef preferredLocation) {
        this.preferredLocation = preferredLocation;
    }


    /**
     * Gets the reorderMultiple value for this InventoryItem.
     * 
     * @return reorderMultiple
     */
    public java.lang.Long getReorderMultiple() {
        return reorderMultiple;
    }


    /**
     * Sets the reorderMultiple value for this InventoryItem.
     * 
     * @param reorderMultiple
     */
    public void setReorderMultiple(java.lang.Long reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }


    /**
     * Gets the cost value for this InventoryItem.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this InventoryItem.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the costUnits value for this InventoryItem.
     * 
     * @return costUnits
     */
    public java.lang.String getCostUnits() {
        return costUnits;
    }


    /**
     * Sets the costUnits value for this InventoryItem.
     * 
     * @param costUnits
     */
    public void setCostUnits(java.lang.String costUnits) {
        this.costUnits = costUnits;
    }


    /**
     * Gets the totalValue value for this InventoryItem.
     * 
     * @return totalValue
     */
    public java.lang.Double getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this InventoryItem.
     * 
     * @param totalValue
     */
    public void setTotalValue(java.lang.Double totalValue) {
        this.totalValue = totalValue;
    }


    /**
     * Gets the averageCost value for this InventoryItem.
     * 
     * @return averageCost
     */
    public java.lang.Double getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this InventoryItem.
     * 
     * @param averageCost
     */
    public void setAverageCost(java.lang.Double averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the useBins value for this InventoryItem.
     * 
     * @return useBins
     */
    public java.lang.Boolean getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this InventoryItem.
     * 
     * @param useBins
     */
    public void setUseBins(java.lang.Boolean useBins) {
        this.useBins = useBins;
    }


    /**
     * Gets the quantityReorderUnits value for this InventoryItem.
     * 
     * @return quantityReorderUnits
     */
    public java.lang.String getQuantityReorderUnits() {
        return quantityReorderUnits;
    }


    /**
     * Sets the quantityReorderUnits value for this InventoryItem.
     * 
     * @param quantityReorderUnits
     */
    public void setQuantityReorderUnits(java.lang.String quantityReorderUnits) {
        this.quantityReorderUnits = quantityReorderUnits;
    }


    /**
     * Gets the leadTime value for this InventoryItem.
     * 
     * @return leadTime
     */
    public java.lang.Long getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this InventoryItem.
     * 
     * @param leadTime
     */
    public void setLeadTime(java.lang.Long leadTime) {
        this.leadTime = leadTime;
    }


    /**
     * Gets the autoLeadTime value for this InventoryItem.
     * 
     * @return autoLeadTime
     */
    public java.lang.Boolean getAutoLeadTime() {
        return autoLeadTime;
    }


    /**
     * Sets the autoLeadTime value for this InventoryItem.
     * 
     * @param autoLeadTime
     */
    public void setAutoLeadTime(java.lang.Boolean autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }


    /**
     * Gets the lastPurchasePrice value for this InventoryItem.
     * 
     * @return lastPurchasePrice
     */
    public java.lang.Double getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this InventoryItem.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(java.lang.Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }


    /**
     * Gets the autoPreferredStockLevel value for this InventoryItem.
     * 
     * @return autoPreferredStockLevel
     */
    public java.lang.Boolean getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }


    /**
     * Sets the autoPreferredStockLevel value for this InventoryItem.
     * 
     * @param autoPreferredStockLevel
     */
    public void setAutoPreferredStockLevel(java.lang.Boolean autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }


    /**
     * Gets the preferredStockLevelDays value for this InventoryItem.
     * 
     * @return preferredStockLevelDays
     */
    public java.lang.Double getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }


    /**
     * Sets the preferredStockLevelDays value for this InventoryItem.
     * 
     * @param preferredStockLevelDays
     */
    public void setPreferredStockLevelDays(java.lang.Double preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }


    /**
     * Gets the safetyStockLevel value for this InventoryItem.
     * 
     * @return safetyStockLevel
     */
    public java.lang.Double getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this InventoryItem.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(java.lang.Double safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }


    /**
     * Gets the safetyStockLevelDays value for this InventoryItem.
     * 
     * @return safetyStockLevelDays
     */
    public java.lang.Long getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }


    /**
     * Sets the safetyStockLevelDays value for this InventoryItem.
     * 
     * @param safetyStockLevelDays
     */
    public void setSafetyStockLevelDays(java.lang.Long safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }


    /**
     * Gets the seasonalDemand value for this InventoryItem.
     * 
     * @return seasonalDemand
     */
    public java.lang.Boolean getSeasonalDemand() {
        return seasonalDemand;
    }


    /**
     * Sets the seasonalDemand value for this InventoryItem.
     * 
     * @param seasonalDemand
     */
    public void setSeasonalDemand(java.lang.Boolean seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }


    /**
     * Gets the safetyStockLevelUnits value for this InventoryItem.
     * 
     * @return safetyStockLevelUnits
     */
    public java.lang.String getSafetyStockLevelUnits() {
        return safetyStockLevelUnits;
    }


    /**
     * Sets the safetyStockLevelUnits value for this InventoryItem.
     * 
     * @param safetyStockLevelUnits
     */
    public void setSafetyStockLevelUnits(java.lang.String safetyStockLevelUnits) {
        this.safetyStockLevelUnits = safetyStockLevelUnits;
    }


    /**
     * Gets the demandModifier value for this InventoryItem.
     * 
     * @return demandModifier
     */
    public java.lang.Double getDemandModifier() {
        return demandModifier;
    }


    /**
     * Sets the demandModifier value for this InventoryItem.
     * 
     * @param demandModifier
     */
    public void setDemandModifier(java.lang.Double demandModifier) {
        this.demandModifier = demandModifier;
    }


    /**
     * Gets the autoReorderPoint value for this InventoryItem.
     * 
     * @return autoReorderPoint
     */
    public java.lang.Boolean getAutoReorderPoint() {
        return autoReorderPoint;
    }


    /**
     * Sets the autoReorderPoint value for this InventoryItem.
     * 
     * @param autoReorderPoint
     */
    public void setAutoReorderPoint(java.lang.Boolean autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }


    /**
     * Gets the storeDisplayName value for this InventoryItem.
     * 
     * @return storeDisplayName
     */
    public java.lang.String getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this InventoryItem.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(java.lang.String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }


    /**
     * Gets the storeDisplayThumbnail value for this InventoryItem.
     * 
     * @return storeDisplayThumbnail
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this InventoryItem.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the storeDisplayImage value for this InventoryItem.
     * 
     * @return storeDisplayImage
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this InventoryItem.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the storeDescription value for this InventoryItem.
     * 
     * @return storeDescription
     */
    public java.lang.String getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this InventoryItem.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(java.lang.String storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the storeDetailedDescription value for this InventoryItem.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this InventoryItem.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeItemTemplate value for this InventoryItem.
     * 
     * @return storeItemTemplate
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }


    /**
     * Sets the storeItemTemplate value for this InventoryItem.
     * 
     * @param storeItemTemplate
     */
    public void setStoreItemTemplate(org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }


    /**
     * Gets the pageTitle value for this InventoryItem.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this InventoryItem.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the metaTagHtml value for this InventoryItem.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this InventoryItem.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this InventoryItem.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this InventoryItem.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the sitemapPriority value for this InventoryItem.
     * 
     * @return sitemapPriority
     */
    public org.mule.module.netsuite.api.internal.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this InventoryItem.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this InventoryItem.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this InventoryItem.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the isDonationItem value for this InventoryItem.
     * 
     * @return isDonationItem
     */
    public java.lang.Boolean getIsDonationItem() {
        return isDonationItem;
    }


    /**
     * Sets the isDonationItem value for this InventoryItem.
     * 
     * @param isDonationItem
     */
    public void setIsDonationItem(java.lang.Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }


    /**
     * Gets the showDefaultDonationAmount value for this InventoryItem.
     * 
     * @return showDefaultDonationAmount
     */
    public java.lang.Boolean getShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }


    /**
     * Sets the showDefaultDonationAmount value for this InventoryItem.
     * 
     * @param showDefaultDonationAmount
     */
    public void setShowDefaultDonationAmount(java.lang.Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }


    /**
     * Gets the maxDonationAmount value for this InventoryItem.
     * 
     * @return maxDonationAmount
     */
    public java.lang.Double getMaxDonationAmount() {
        return maxDonationAmount;
    }


    /**
     * Sets the maxDonationAmount value for this InventoryItem.
     * 
     * @param maxDonationAmount
     */
    public void setMaxDonationAmount(java.lang.Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }


    /**
     * Gets the dontShowPrice value for this InventoryItem.
     * 
     * @return dontShowPrice
     */
    public java.lang.Boolean getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this InventoryItem.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(java.lang.Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the noPriceMessage value for this InventoryItem.
     * 
     * @return noPriceMessage
     */
    public java.lang.String getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this InventoryItem.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(java.lang.String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }


    /**
     * Gets the outOfStockMessage value for this InventoryItem.
     * 
     * @return outOfStockMessage
     */
    public java.lang.String getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this InventoryItem.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(java.lang.String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }


    /**
     * Gets the onSpecial value for this InventoryItem.
     * 
     * @return onSpecial
     */
    public java.lang.Boolean getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this InventoryItem.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(java.lang.Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the outOfStockBehavior value for this InventoryItem.
     * 
     * @return outOfStockBehavior
     */
    public org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this InventoryItem.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the relatedItemsDescription value for this InventoryItem.
     * 
     * @return relatedItemsDescription
     */
    public java.lang.String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }


    /**
     * Sets the relatedItemsDescription value for this InventoryItem.
     * 
     * @param relatedItemsDescription
     */
    public void setRelatedItemsDescription(java.lang.String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }


    /**
     * Gets the specialsDescription value for this InventoryItem.
     * 
     * @return specialsDescription
     */
    public java.lang.String getSpecialsDescription() {
        return specialsDescription;
    }


    /**
     * Sets the specialsDescription value for this InventoryItem.
     * 
     * @param specialsDescription
     */
    public void setSpecialsDescription(java.lang.String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }


    /**
     * Gets the featuredDescription value for this InventoryItem.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this InventoryItem.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the shoppingDotComCategory value for this InventoryItem.
     * 
     * @return shoppingDotComCategory
     */
    public java.lang.String getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this InventoryItem.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(java.lang.String shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }


    /**
     * Gets the shopzillaCategoryId value for this InventoryItem.
     * 
     * @return shopzillaCategoryId
     */
    public java.lang.Long getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this InventoryItem.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(java.lang.Long shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }


    /**
     * Gets the nexTagCategory value for this InventoryItem.
     * 
     * @return nexTagCategory
     */
    public java.lang.String getNexTagCategory() {
        return nexTagCategory;
    }


    /**
     * Sets the nexTagCategory value for this InventoryItem.
     * 
     * @param nexTagCategory
     */
    public void setNexTagCategory(java.lang.String nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }


    /**
     * Gets the urlComponent value for this InventoryItem.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this InventoryItem.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the customForm value for this InventoryItem.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this InventoryItem.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this InventoryItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this InventoryItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this InventoryItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this InventoryItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this InventoryItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this InventoryItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the vendorName value for this InventoryItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this InventoryItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the parent value for this InventoryItem.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this InventoryItem.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isOnline value for this InventoryItem.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this InventoryItem.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isGcoCompliant value for this InventoryItem.
     * 
     * @return isGcoCompliant
     */
    public java.lang.Boolean getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this InventoryItem.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(java.lang.Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the offerSupport value for this InventoryItem.
     * 
     * @return offerSupport
     */
    public java.lang.Boolean getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this InventoryItem.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(java.lang.Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the isInactive value for this InventoryItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this InventoryItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the availableToPartners value for this InventoryItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this InventoryItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this InventoryItem.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InventoryItem.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this InventoryItem.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this InventoryItem.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this InventoryItem.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryItem.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the costingMethod value for this InventoryItem.
     * 
     * @return costingMethod
     */
    public org.mule.module.netsuite.api.internal.ItemCostingMethod getCostingMethod() {
        return costingMethod;
    }


    /**
     * Sets the costingMethod value for this InventoryItem.
     * 
     * @param costingMethod
     */
    public void setCostingMethod(org.mule.module.netsuite.api.internal.ItemCostingMethod costingMethod) {
        this.costingMethod = costingMethod;
    }


    /**
     * Gets the currency value for this InventoryItem.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InventoryItem.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the preferredStockLevel value for this InventoryItem.
     * 
     * @return preferredStockLevel
     */
    public java.lang.Double getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this InventoryItem.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(java.lang.Double preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }


    /**
     * Gets the pricingMatrix value for this InventoryItem.
     * 
     * @return pricingMatrix
     */
    public org.mule.module.netsuite.api.internal.PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }


    /**
     * Sets the pricingMatrix value for this InventoryItem.
     * 
     * @param pricingMatrix
     */
    public void setPricingMatrix(org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }


    /**
     * Gets the purchaseTaxCode value for this InventoryItem.
     * 
     * @return purchaseTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }


    /**
     * Sets the purchaseTaxCode value for this InventoryItem.
     * 
     * @param purchaseTaxCode
     */
    public void setPurchaseTaxCode(org.mule.module.netsuite.api.internal.RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }


    /**
     * Gets the defaultReturnCost value for this InventoryItem.
     * 
     * @return defaultReturnCost
     */
    public java.lang.Double getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this InventoryItem.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(java.lang.Double defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }


    /**
     * Gets the quantityBackOrdered value for this InventoryItem.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this InventoryItem.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCommitted value for this InventoryItem.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this InventoryItem.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityAvailable value for this InventoryItem.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this InventoryItem.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityOnHand value for this InventoryItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the onHandValueMli value for this InventoryItem.
     * 
     * @return onHandValueMli
     */
    public java.lang.Double getOnHandValueMli() {
        return onHandValueMli;
    }


    /**
     * Sets the onHandValueMli value for this InventoryItem.
     * 
     * @param onHandValueMli
     */
    public void setOnHandValueMli(java.lang.Double onHandValueMli) {
        this.onHandValueMli = onHandValueMli;
    }


    /**
     * Gets the quantityOnOrder value for this InventoryItem.
     * 
     * @return quantityOnOrder
     */
    public java.lang.Double getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this InventoryItem.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(java.lang.Double quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }


    /**
     * Gets the rate value for this InventoryItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this InventoryItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the reorderPoint value for this InventoryItem.
     * 
     * @return reorderPoint
     */
    public java.lang.Double getReorderPoint() {
        return reorderPoint;
    }


    /**
     * Sets the reorderPoint value for this InventoryItem.
     * 
     * @param reorderPoint
     */
    public void setReorderPoint(java.lang.Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }


    /**
     * Gets the quantityCommittedUnits value for this InventoryItem.
     * 
     * @return quantityCommittedUnits
     */
    public java.lang.String getQuantityCommittedUnits() {
        return quantityCommittedUnits;
    }


    /**
     * Sets the quantityCommittedUnits value for this InventoryItem.
     * 
     * @param quantityCommittedUnits
     */
    public void setQuantityCommittedUnits(java.lang.String quantityCommittedUnits) {
        this.quantityCommittedUnits = quantityCommittedUnits;
    }


    /**
     * Gets the salesTaxCode value for this InventoryItem.
     * 
     * @return salesTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this InventoryItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(org.mule.module.netsuite.api.internal.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the quantityAvailableUnits value for this InventoryItem.
     * 
     * @return quantityAvailableUnits
     */
    public java.lang.String getQuantityAvailableUnits() {
        return quantityAvailableUnits;
    }


    /**
     * Sets the quantityAvailableUnits value for this InventoryItem.
     * 
     * @param quantityAvailableUnits
     */
    public void setQuantityAvailableUnits(java.lang.String quantityAvailableUnits) {
        this.quantityAvailableUnits = quantityAvailableUnits;
    }


    /**
     * Gets the quantityOnHandUnits value for this InventoryItem.
     * 
     * @return quantityOnHandUnits
     */
    public java.lang.String getQuantityOnHandUnits() {
        return quantityOnHandUnits;
    }


    /**
     * Sets the quantityOnHandUnits value for this InventoryItem.
     * 
     * @param quantityOnHandUnits
     */
    public void setQuantityOnHandUnits(java.lang.String quantityOnHandUnits) {
        this.quantityOnHandUnits = quantityOnHandUnits;
    }


    /**
     * Gets the vendor value for this InventoryItem.
     * 
     * @return vendor
     */
    public org.mule.module.netsuite.api.internal.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this InventoryItem.
     * 
     * @param vendor
     */
    public void setVendor(org.mule.module.netsuite.api.internal.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the quantityOnOrderUnits value for this InventoryItem.
     * 
     * @return quantityOnOrderUnits
     */
    public java.lang.String getQuantityOnOrderUnits() {
        return quantityOnOrderUnits;
    }


    /**
     * Sets the quantityOnOrderUnits value for this InventoryItem.
     * 
     * @param quantityOnOrderUnits
     */
    public void setQuantityOnOrderUnits(java.lang.String quantityOnOrderUnits) {
        this.quantityOnOrderUnits = quantityOnOrderUnits;
    }


    /**
     * Gets the productFeedList value for this InventoryItem.
     * 
     * @return productFeedList
     */
    public org.mule.module.netsuite.api.internal.ProductFeedList getProductFeedList() {
        return productFeedList;
    }


    /**
     * Sets the productFeedList value for this InventoryItem.
     * 
     * @param productFeedList
     */
    public void setProductFeedList(org.mule.module.netsuite.api.internal.ProductFeedList productFeedList) {
        this.productFeedList = productFeedList;
    }


    /**
     * Gets the subsidiaryList value for this InventoryItem.
     * 
     * @return subsidiaryList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this InventoryItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the itemOptionsList value for this InventoryItem.
     * 
     * @return itemOptionsList
     */
    public org.mule.module.netsuite.api.internal.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this InventoryItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the itemVendorList value for this InventoryItem.
     * 
     * @return itemVendorList
     */
    public org.mule.module.netsuite.api.internal.ItemVendorList getItemVendorList() {
        return itemVendorList;
    }


    /**
     * Sets the itemVendorList value for this InventoryItem.
     * 
     * @param itemVendorList
     */
    public void setItemVendorList(org.mule.module.netsuite.api.internal.ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }


    /**
     * Gets the siteCategoryList value for this InventoryItem.
     * 
     * @return siteCategoryList
     */
    public org.mule.module.netsuite.api.internal.SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this InventoryItem.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the translationsList value for this InventoryItem.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this InventoryItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the binNumberList value for this InventoryItem.
     * 
     * @return binNumberList
     */
    public org.mule.module.netsuite.api.internal.InventoryItemBinNumberList getBinNumberList() {
        return binNumberList;
    }


    /**
     * Sets the binNumberList value for this InventoryItem.
     * 
     * @param binNumberList
     */
    public void setBinNumberList(org.mule.module.netsuite.api.internal.InventoryItemBinNumberList binNumberList) {
        this.binNumberList = binNumberList;
    }


    /**
     * Gets the locationsList value for this InventoryItem.
     * 
     * @return locationsList
     */
    public org.mule.module.netsuite.api.internal.InventoryItemLocationsList getLocationsList() {
        return locationsList;
    }


    /**
     * Sets the locationsList value for this InventoryItem.
     * 
     * @param locationsList
     */
    public void setLocationsList(org.mule.module.netsuite.api.internal.InventoryItemLocationsList locationsList) {
        this.locationsList = locationsList;
    }


    /**
     * Gets the matrixOptionList value for this InventoryItem.
     * 
     * @return matrixOptionList
     */
    public org.mule.module.netsuite.api.internal.MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }


    /**
     * Sets the matrixOptionList value for this InventoryItem.
     * 
     * @param matrixOptionList
     */
    public void setMatrixOptionList(org.mule.module.netsuite.api.internal.MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }


    /**
     * Gets the presentationItemList value for this InventoryItem.
     * 
     * @return presentationItemList
     */
    public org.mule.module.netsuite.api.internal.PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this InventoryItem.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the customFieldList value for this InventoryItem.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InventoryItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this InventoryItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InventoryItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this InventoryItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InventoryItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItem)) return false;
        InventoryItem other = (InventoryItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.purchaseDescription==null && other.getPurchaseDescription()==null) || 
             (this.purchaseDescription!=null &&
              this.purchaseDescription.equals(other.getPurchaseDescription()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              this.copyDescription.equals(other.getCopyDescription()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.dateConvertedToInv==null && other.getDateConvertedToInv()==null) || 
             (this.dateConvertedToInv!=null &&
              this.dateConvertedToInv.equals(other.getDateConvertedToInv()))) &&
            ((this.originalItemType==null && other.getOriginalItemType()==null) || 
             (this.originalItemType!=null &&
              this.originalItemType.equals(other.getOriginalItemType()))) &&
            ((this.originalItemSubtype==null && other.getOriginalItemSubtype()==null) || 
             (this.originalItemSubtype!=null &&
              this.originalItemSubtype.equals(other.getOriginalItemSubtype()))) &&
            ((this.cogsAccount==null && other.getCogsAccount()==null) || 
             (this.cogsAccount!=null &&
              this.cogsAccount.equals(other.getCogsAccount()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              this.salesDescription.equals(other.getSalesDescription()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.matrixType==null && other.getMatrixType()==null) || 
             (this.matrixType!=null &&
              this.matrixType.equals(other.getMatrixType()))) &&
            ((this.assetAccount==null && other.getAssetAccount()==null) || 
             (this.assetAccount!=null &&
              this.assetAccount.equals(other.getAssetAccount()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              this.matchBillToReceipt.equals(other.getMatchBillToReceipt()))) &&
            ((this.billQtyVarianceAcct==null && other.getBillQtyVarianceAcct()==null) || 
             (this.billQtyVarianceAcct!=null &&
              this.billQtyVarianceAcct.equals(other.getBillQtyVarianceAcct()))) &&
            ((this.billPriceVarianceAcct==null && other.getBillPriceVarianceAcct()==null) || 
             (this.billPriceVarianceAcct!=null &&
              this.billPriceVarianceAcct.equals(other.getBillPriceVarianceAcct()))) &&
            ((this.billExchRateVarianceAcct==null && other.getBillExchRateVarianceAcct()==null) || 
             (this.billExchRateVarianceAcct!=null &&
              this.billExchRateVarianceAcct.equals(other.getBillExchRateVarianceAcct()))) &&
            ((this.gainLossAccount==null && other.getGainLossAccount()==null) || 
             (this.gainLossAccount!=null &&
              this.gainLossAccount.equals(other.getGainLossAccount()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingCostUnits==null && other.getShippingCostUnits()==null) || 
             (this.shippingCostUnits!=null &&
              this.shippingCostUnits.equals(other.getShippingCostUnits()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.handlingCostUnits==null && other.getHandlingCostUnits()==null) || 
             (this.handlingCostUnits!=null &&
              this.handlingCostUnits.equals(other.getHandlingCostUnits()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
            ((this.weightUnits==null && other.getWeightUnits()==null) || 
             (this.weightUnits!=null &&
              this.weightUnits.equals(other.getWeightUnits()))) &&
            ((this.costingMethodDisplay==null && other.getCostingMethodDisplay()==null) || 
             (this.costingMethodDisplay!=null &&
              this.costingMethodDisplay.equals(other.getCostingMethodDisplay()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.stockUnit==null && other.getStockUnit()==null) || 
             (this.stockUnit!=null &&
              this.stockUnit.equals(other.getStockUnit()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              this.saleUnit.equals(other.getSaleUnit()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.trackLandedCost==null && other.getTrackLandedCost()==null) || 
             (this.trackLandedCost!=null &&
              this.trackLandedCost.equals(other.getTrackLandedCost()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              this.isDropShipItem.equals(other.getIsDropShipItem()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              this.stockDescription.equals(other.getStockDescription()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount()))) &&
            ((this.producer==null && other.getProducer()==null) || 
             (this.producer!=null &&
              this.producer.equals(other.getProducer()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              this.mpn.equals(other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              this.multManufactureAddr.equals(other.getMultManufactureAddr()))) &&
            ((this.manufacturerAddr1==null && other.getManufacturerAddr1()==null) || 
             (this.manufacturerAddr1!=null &&
              this.manufacturerAddr1.equals(other.getManufacturerAddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              this.manufacturerCity.equals(other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              this.manufacturerState.equals(other.getManufacturerState()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              this.manufacturerZip.equals(other.getManufacturerZip()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              this.manufacturerTaxId.equals(other.getManufacturerTaxId()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              this.scheduleBNumber.equals(other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              this.scheduleBQuantity.equals(other.getScheduleBQuantity()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              this.scheduleBCode.equals(other.getScheduleBCode()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              this.manufacturerTariff.equals(other.getManufacturerTariff()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              this.preferenceCriterion.equals(other.getPreferenceCriterion()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.enforceMinQtyInternally==null && other.getEnforceMinQtyInternally()==null) || 
             (this.enforceMinQtyInternally!=null &&
              this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally()))) &&
            ((this.minimumQuantityUnits==null && other.getMinimumQuantityUnits()==null) || 
             (this.minimumQuantityUnits!=null &&
              this.minimumQuantityUnits.equals(other.getMinimumQuantityUnits()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              this.shipPackage.equals(other.getShipPackage()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              this.shipIndividually.equals(other.getShipIndividually()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              this.pricesIncludeTax.equals(other.getPricesIncludeTax()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule()))) &&
            ((this.reorderPointUnits==null && other.getReorderPointUnits()==null) || 
             (this.reorderPointUnits!=null &&
              this.reorderPointUnits.equals(other.getReorderPointUnits()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              this.useMarginalRates.equals(other.getUseMarginalRates()))) &&
            ((this.preferredStockLevelUnits==null && other.getPreferredStockLevelUnits()==null) || 
             (this.preferredStockLevelUnits!=null &&
              this.preferredStockLevelUnits.equals(other.getPreferredStockLevelUnits()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.transferPrice==null && other.getTransferPrice()==null) || 
             (this.transferPrice!=null &&
              this.transferPrice.equals(other.getTransferPrice()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.costEstimateUnits==null && other.getCostEstimateUnits()==null) || 
             (this.costEstimateUnits!=null &&
              this.costEstimateUnits.equals(other.getCostEstimateUnits()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.preferredLocation==null && other.getPreferredLocation()==null) || 
             (this.preferredLocation!=null &&
              this.preferredLocation.equals(other.getPreferredLocation()))) &&
            ((this.reorderMultiple==null && other.getReorderMultiple()==null) || 
             (this.reorderMultiple!=null &&
              this.reorderMultiple.equals(other.getReorderMultiple()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costUnits==null && other.getCostUnits()==null) || 
             (this.costUnits!=null &&
              this.costUnits.equals(other.getCostUnits()))) &&
            ((this.totalValue==null && other.getTotalValue()==null) || 
             (this.totalValue!=null &&
              this.totalValue.equals(other.getTotalValue()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              this.useBins.equals(other.getUseBins()))) &&
            ((this.quantityReorderUnits==null && other.getQuantityReorderUnits()==null) || 
             (this.quantityReorderUnits!=null &&
              this.quantityReorderUnits.equals(other.getQuantityReorderUnits()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              this.leadTime.equals(other.getLeadTime()))) &&
            ((this.autoLeadTime==null && other.getAutoLeadTime()==null) || 
             (this.autoLeadTime!=null &&
              this.autoLeadTime.equals(other.getAutoLeadTime()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              this.lastPurchasePrice.equals(other.getLastPurchasePrice()))) &&
            ((this.autoPreferredStockLevel==null && other.getAutoPreferredStockLevel()==null) || 
             (this.autoPreferredStockLevel!=null &&
              this.autoPreferredStockLevel.equals(other.getAutoPreferredStockLevel()))) &&
            ((this.preferredStockLevelDays==null && other.getPreferredStockLevelDays()==null) || 
             (this.preferredStockLevelDays!=null &&
              this.preferredStockLevelDays.equals(other.getPreferredStockLevelDays()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              this.safetyStockLevel.equals(other.getSafetyStockLevel()))) &&
            ((this.safetyStockLevelDays==null && other.getSafetyStockLevelDays()==null) || 
             (this.safetyStockLevelDays!=null &&
              this.safetyStockLevelDays.equals(other.getSafetyStockLevelDays()))) &&
            ((this.seasonalDemand==null && other.getSeasonalDemand()==null) || 
             (this.seasonalDemand!=null &&
              this.seasonalDemand.equals(other.getSeasonalDemand()))) &&
            ((this.safetyStockLevelUnits==null && other.getSafetyStockLevelUnits()==null) || 
             (this.safetyStockLevelUnits!=null &&
              this.safetyStockLevelUnits.equals(other.getSafetyStockLevelUnits()))) &&
            ((this.demandModifier==null && other.getDemandModifier()==null) || 
             (this.demandModifier!=null &&
              this.demandModifier.equals(other.getDemandModifier()))) &&
            ((this.autoReorderPoint==null && other.getAutoReorderPoint()==null) || 
             (this.autoReorderPoint!=null &&
              this.autoReorderPoint.equals(other.getAutoReorderPoint()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              this.storeDisplayName.equals(other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              this.storeDisplayImage.equals(other.getStoreDisplayImage()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              this.storeDescription.equals(other.getStoreDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              this.storeDetailedDescription.equals(other.getStoreDetailedDescription()))) &&
            ((this.storeItemTemplate==null && other.getStoreItemTemplate()==null) || 
             (this.storeItemTemplate!=null &&
              this.storeItemTemplate.equals(other.getStoreItemTemplate()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.isDonationItem==null && other.getIsDonationItem()==null) || 
             (this.isDonationItem!=null &&
              this.isDonationItem.equals(other.getIsDonationItem()))) &&
            ((this.showDefaultDonationAmount==null && other.getShowDefaultDonationAmount()==null) || 
             (this.showDefaultDonationAmount!=null &&
              this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount()))) &&
            ((this.maxDonationAmount==null && other.getMaxDonationAmount()==null) || 
             (this.maxDonationAmount!=null &&
              this.maxDonationAmount.equals(other.getMaxDonationAmount()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              this.dontShowPrice.equals(other.getDontShowPrice()))) &&
            ((this.noPriceMessage==null && other.getNoPriceMessage()==null) || 
             (this.noPriceMessage!=null &&
              this.noPriceMessage.equals(other.getNoPriceMessage()))) &&
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              this.outOfStockMessage.equals(other.getOutOfStockMessage()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.relatedItemsDescription==null && other.getRelatedItemsDescription()==null) || 
             (this.relatedItemsDescription!=null &&
              this.relatedItemsDescription.equals(other.getRelatedItemsDescription()))) &&
            ((this.specialsDescription==null && other.getSpecialsDescription()==null) || 
             (this.specialsDescription!=null &&
              this.specialsDescription.equals(other.getSpecialsDescription()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              this.shoppingDotComCategory.equals(other.getShoppingDotComCategory()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              this.shopzillaCategoryId.equals(other.getShopzillaCategoryId()))) &&
            ((this.nexTagCategory==null && other.getNexTagCategory()==null) || 
             (this.nexTagCategory!=null &&
              this.nexTagCategory.equals(other.getNexTagCategory()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              this.upcCode.equals(other.getUpcCode()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              this.availableToPartners.equals(other.getAvailableToPartners()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.costingMethod==null && other.getCostingMethod()==null) || 
             (this.costingMethod!=null &&
              this.costingMethod.equals(other.getCostingMethod()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              this.preferredStockLevel.equals(other.getPreferredStockLevel()))) &&
            ((this.pricingMatrix==null && other.getPricingMatrix()==null) || 
             (this.pricingMatrix!=null &&
              this.pricingMatrix.equals(other.getPricingMatrix()))) &&
            ((this.purchaseTaxCode==null && other.getPurchaseTaxCode()==null) || 
             (this.purchaseTaxCode!=null &&
              this.purchaseTaxCode.equals(other.getPurchaseTaxCode()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              this.defaultReturnCost.equals(other.getDefaultReturnCost()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.onHandValueMli==null && other.getOnHandValueMli()==null) || 
             (this.onHandValueMli!=null &&
              this.onHandValueMli.equals(other.getOnHandValueMli()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              this.quantityOnOrder.equals(other.getQuantityOnOrder()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.reorderPoint==null && other.getReorderPoint()==null) || 
             (this.reorderPoint!=null &&
              this.reorderPoint.equals(other.getReorderPoint()))) &&
            ((this.quantityCommittedUnits==null && other.getQuantityCommittedUnits()==null) || 
             (this.quantityCommittedUnits!=null &&
              this.quantityCommittedUnits.equals(other.getQuantityCommittedUnits()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              this.salesTaxCode.equals(other.getSalesTaxCode()))) &&
            ((this.quantityAvailableUnits==null && other.getQuantityAvailableUnits()==null) || 
             (this.quantityAvailableUnits!=null &&
              this.quantityAvailableUnits.equals(other.getQuantityAvailableUnits()))) &&
            ((this.quantityOnHandUnits==null && other.getQuantityOnHandUnits()==null) || 
             (this.quantityOnHandUnits!=null &&
              this.quantityOnHandUnits.equals(other.getQuantityOnHandUnits()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.quantityOnOrderUnits==null && other.getQuantityOnOrderUnits()==null) || 
             (this.quantityOnOrderUnits!=null &&
              this.quantityOnOrderUnits.equals(other.getQuantityOnOrderUnits()))) &&
            ((this.productFeedList==null && other.getProductFeedList()==null) || 
             (this.productFeedList!=null &&
              this.productFeedList.equals(other.getProductFeedList()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.itemOptionsList==null && other.getItemOptionsList()==null) || 
             (this.itemOptionsList!=null &&
              this.itemOptionsList.equals(other.getItemOptionsList()))) &&
            ((this.itemVendorList==null && other.getItemVendorList()==null) || 
             (this.itemVendorList!=null &&
              this.itemVendorList.equals(other.getItemVendorList()))) &&
            ((this.siteCategoryList==null && other.getSiteCategoryList()==null) || 
             (this.siteCategoryList!=null &&
              this.siteCategoryList.equals(other.getSiteCategoryList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.binNumberList==null && other.getBinNumberList()==null) || 
             (this.binNumberList!=null &&
              this.binNumberList.equals(other.getBinNumberList()))) &&
            ((this.locationsList==null && other.getLocationsList()==null) || 
             (this.locationsList!=null &&
              this.locationsList.equals(other.getLocationsList()))) &&
            ((this.matrixOptionList==null && other.getMatrixOptionList()==null) || 
             (this.matrixOptionList!=null &&
              this.matrixOptionList.equals(other.getMatrixOptionList()))) &&
            ((this.presentationItemList==null && other.getPresentationItemList()==null) || 
             (this.presentationItemList!=null &&
              this.presentationItemList.equals(other.getPresentationItemList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getPurchaseDescription() != null) {
            _hashCode += getPurchaseDescription().hashCode();
        }
        if (getCopyDescription() != null) {
            _hashCode += getCopyDescription().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
        }
        if (getDateConvertedToInv() != null) {
            _hashCode += getDateConvertedToInv().hashCode();
        }
        if (getOriginalItemType() != null) {
            _hashCode += getOriginalItemType().hashCode();
        }
        if (getOriginalItemSubtype() != null) {
            _hashCode += getOriginalItemSubtype().hashCode();
        }
        if (getCogsAccount() != null) {
            _hashCode += getCogsAccount().hashCode();
        }
        if (getSalesDescription() != null) {
            _hashCode += getSalesDescription().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getMatrixType() != null) {
            _hashCode += getMatrixType().hashCode();
        }
        if (getAssetAccount() != null) {
            _hashCode += getAssetAccount().hashCode();
        }
        if (getMatchBillToReceipt() != null) {
            _hashCode += getMatchBillToReceipt().hashCode();
        }
        if (getBillQtyVarianceAcct() != null) {
            _hashCode += getBillQtyVarianceAcct().hashCode();
        }
        if (getBillPriceVarianceAcct() != null) {
            _hashCode += getBillPriceVarianceAcct().hashCode();
        }
        if (getBillExchRateVarianceAcct() != null) {
            _hashCode += getBillExchRateVarianceAcct().hashCode();
        }
        if (getGainLossAccount() != null) {
            _hashCode += getGainLossAccount().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingCostUnits() != null) {
            _hashCode += getShippingCostUnits().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getHandlingCostUnits() != null) {
            _hashCode += getHandlingCostUnits().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        if (getWeightUnits() != null) {
            _hashCode += getWeightUnits().hashCode();
        }
        if (getCostingMethodDisplay() != null) {
            _hashCode += getCostingMethodDisplay().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getStockUnit() != null) {
            _hashCode += getStockUnit().hashCode();
        }
        if (getPurchaseUnit() != null) {
            _hashCode += getPurchaseUnit().hashCode();
        }
        if (getSaleUnit() != null) {
            _hashCode += getSaleUnit().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getTrackLandedCost() != null) {
            _hashCode += getTrackLandedCost().hashCode();
        }
        if (getIsDropShipItem() != null) {
            _hashCode += getIsDropShipItem().hashCode();
        }
        if (getIsSpecialOrderItem() != null) {
            _hashCode += getIsSpecialOrderItem().hashCode();
        }
        if (getStockDescription() != null) {
            _hashCode += getStockDescription().hashCode();
        }
        if (getDeferredRevenueAccount() != null) {
            _hashCode += getDeferredRevenueAccount().hashCode();
        }
        if (getProducer() != null) {
            _hashCode += getProducer().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getMpn() != null) {
            _hashCode += getMpn().hashCode();
        }
        if (getMultManufactureAddr() != null) {
            _hashCode += getMultManufactureAddr().hashCode();
        }
        if (getManufacturerAddr1() != null) {
            _hashCode += getManufacturerAddr1().hashCode();
        }
        if (getManufacturerCity() != null) {
            _hashCode += getManufacturerCity().hashCode();
        }
        if (getManufacturerState() != null) {
            _hashCode += getManufacturerState().hashCode();
        }
        if (getManufacturerZip() != null) {
            _hashCode += getManufacturerZip().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getManufacturerTaxId() != null) {
            _hashCode += getManufacturerTaxId().hashCode();
        }
        if (getScheduleBNumber() != null) {
            _hashCode += getScheduleBNumber().hashCode();
        }
        if (getScheduleBQuantity() != null) {
            _hashCode += getScheduleBQuantity().hashCode();
        }
        if (getScheduleBCode() != null) {
            _hashCode += getScheduleBCode().hashCode();
        }
        if (getManufacturerTariff() != null) {
            _hashCode += getManufacturerTariff().hashCode();
        }
        if (getPreferenceCriterion() != null) {
            _hashCode += getPreferenceCriterion().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getEnforceMinQtyInternally() != null) {
            _hashCode += getEnforceMinQtyInternally().hashCode();
        }
        if (getMinimumQuantityUnits() != null) {
            _hashCode += getMinimumQuantityUnits().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getShipPackage() != null) {
            _hashCode += getShipPackage().hashCode();
        }
        if (getShipIndividually() != null) {
            _hashCode += getShipIndividually().hashCode();
        }
        if (getPricesIncludeTax() != null) {
            _hashCode += getPricesIncludeTax().hashCode();
        }
        if (getQuantityPricingSchedule() != null) {
            _hashCode += getQuantityPricingSchedule().hashCode();
        }
        if (getReorderPointUnits() != null) {
            _hashCode += getReorderPointUnits().hashCode();
        }
        if (getUseMarginalRates() != null) {
            _hashCode += getUseMarginalRates().hashCode();
        }
        if (getPreferredStockLevelUnits() != null) {
            _hashCode += getPreferredStockLevelUnits().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getTransferPrice() != null) {
            _hashCode += getTransferPrice().hashCode();
        }
        if (getOverallQuantityPricingType() != null) {
            _hashCode += getOverallQuantityPricingType().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getCostEstimateUnits() != null) {
            _hashCode += getCostEstimateUnits().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getPreferredLocation() != null) {
            _hashCode += getPreferredLocation().hashCode();
        }
        if (getReorderMultiple() != null) {
            _hashCode += getReorderMultiple().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostUnits() != null) {
            _hashCode += getCostUnits().hashCode();
        }
        if (getTotalValue() != null) {
            _hashCode += getTotalValue().hashCode();
        }
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getUseBins() != null) {
            _hashCode += getUseBins().hashCode();
        }
        if (getQuantityReorderUnits() != null) {
            _hashCode += getQuantityReorderUnits().hashCode();
        }
        if (getLeadTime() != null) {
            _hashCode += getLeadTime().hashCode();
        }
        if (getAutoLeadTime() != null) {
            _hashCode += getAutoLeadTime().hashCode();
        }
        if (getLastPurchasePrice() != null) {
            _hashCode += getLastPurchasePrice().hashCode();
        }
        if (getAutoPreferredStockLevel() != null) {
            _hashCode += getAutoPreferredStockLevel().hashCode();
        }
        if (getPreferredStockLevelDays() != null) {
            _hashCode += getPreferredStockLevelDays().hashCode();
        }
        if (getSafetyStockLevel() != null) {
            _hashCode += getSafetyStockLevel().hashCode();
        }
        if (getSafetyStockLevelDays() != null) {
            _hashCode += getSafetyStockLevelDays().hashCode();
        }
        if (getSeasonalDemand() != null) {
            _hashCode += getSeasonalDemand().hashCode();
        }
        if (getSafetyStockLevelUnits() != null) {
            _hashCode += getSafetyStockLevelUnits().hashCode();
        }
        if (getDemandModifier() != null) {
            _hashCode += getDemandModifier().hashCode();
        }
        if (getAutoReorderPoint() != null) {
            _hashCode += getAutoReorderPoint().hashCode();
        }
        if (getStoreDisplayName() != null) {
            _hashCode += getStoreDisplayName().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
        }
        if (getStoreDisplayImage() != null) {
            _hashCode += getStoreDisplayImage().hashCode();
        }
        if (getStoreDescription() != null) {
            _hashCode += getStoreDescription().hashCode();
        }
        if (getStoreDetailedDescription() != null) {
            _hashCode += getStoreDetailedDescription().hashCode();
        }
        if (getStoreItemTemplate() != null) {
            _hashCode += getStoreItemTemplate().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getIsDonationItem() != null) {
            _hashCode += getIsDonationItem().hashCode();
        }
        if (getShowDefaultDonationAmount() != null) {
            _hashCode += getShowDefaultDonationAmount().hashCode();
        }
        if (getMaxDonationAmount() != null) {
            _hashCode += getMaxDonationAmount().hashCode();
        }
        if (getDontShowPrice() != null) {
            _hashCode += getDontShowPrice().hashCode();
        }
        if (getNoPriceMessage() != null) {
            _hashCode += getNoPriceMessage().hashCode();
        }
        if (getOutOfStockMessage() != null) {
            _hashCode += getOutOfStockMessage().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getRelatedItemsDescription() != null) {
            _hashCode += getRelatedItemsDescription().hashCode();
        }
        if (getSpecialsDescription() != null) {
            _hashCode += getSpecialsDescription().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getShoppingDotComCategory() != null) {
            _hashCode += getShoppingDotComCategory().hashCode();
        }
        if (getShopzillaCategoryId() != null) {
            _hashCode += getShopzillaCategoryId().hashCode();
        }
        if (getNexTagCategory() != null) {
            _hashCode += getNexTagCategory().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getUpcCode() != null) {
            _hashCode += getUpcCode().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getAvailableToPartners() != null) {
            _hashCode += getAvailableToPartners().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getCostingMethod() != null) {
            _hashCode += getCostingMethod().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPreferredStockLevel() != null) {
            _hashCode += getPreferredStockLevel().hashCode();
        }
        if (getPricingMatrix() != null) {
            _hashCode += getPricingMatrix().hashCode();
        }
        if (getPurchaseTaxCode() != null) {
            _hashCode += getPurchaseTaxCode().hashCode();
        }
        if (getDefaultReturnCost() != null) {
            _hashCode += getDefaultReturnCost().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getOnHandValueMli() != null) {
            _hashCode += getOnHandValueMli().hashCode();
        }
        if (getQuantityOnOrder() != null) {
            _hashCode += getQuantityOnOrder().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getReorderPoint() != null) {
            _hashCode += getReorderPoint().hashCode();
        }
        if (getQuantityCommittedUnits() != null) {
            _hashCode += getQuantityCommittedUnits().hashCode();
        }
        if (getSalesTaxCode() != null) {
            _hashCode += getSalesTaxCode().hashCode();
        }
        if (getQuantityAvailableUnits() != null) {
            _hashCode += getQuantityAvailableUnits().hashCode();
        }
        if (getQuantityOnHandUnits() != null) {
            _hashCode += getQuantityOnHandUnits().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getQuantityOnOrderUnits() != null) {
            _hashCode += getQuantityOnOrderUnits().hashCode();
        }
        if (getProductFeedList() != null) {
            _hashCode += getProductFeedList().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getItemOptionsList() != null) {
            _hashCode += getItemOptionsList().hashCode();
        }
        if (getItemVendorList() != null) {
            _hashCode += getItemVendorList().hashCode();
        }
        if (getSiteCategoryList() != null) {
            _hashCode += getSiteCategoryList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getBinNumberList() != null) {
            _hashCode += getBinNumberList().hashCode();
        }
        if (getLocationsList() != null) {
            _hashCode += getLocationsList().hashCode();
        }
        if (getMatrixOptionList() != null) {
            _hashCode += getMatrixOptionList().hashCode();
        }
        if (getPresentationItemList() != null) {
            _hashCode += getPresentationItemList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItem"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateConvertedToInv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dateConvertedToInv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "originalItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalItemSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "originalItemSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemSubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "cogsAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "matrixType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemMatrixType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "assetAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gainLossAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "gainLossAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCostUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shippingCostUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCostUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "handlingCostUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemWeightUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "weightUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethodDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costingMethodDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "producer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ScheduleBCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceMinQtyInternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "enforceMinQtyInternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantityUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "minimumQuantityUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPointUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "reorderPointUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredStockLevelUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReorderUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityReorderUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "safetyStockLevelUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeItemTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeItemTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "SitemapPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDonationItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDonationItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDefaultDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "showDefaultDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "maxDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "relatedItemsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "specialsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemCostingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricingMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PricingMatrix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "purchaseTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHandValueMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onHandValueMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommittedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityCommittedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailableUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityAvailableUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHandUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnHandUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrderUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnOrderUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFeedList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "productFeedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ProductFeedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemOptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemVendorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemVendorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemVendorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "binNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemBinNumberList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "locationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemLocationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixOptionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "matrixOptionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "MatrixOptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PresentationItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
