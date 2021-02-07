using System.Collections.Generic;

namespace shopcart.Interfaces
{
    public interface IShoppingCart
    {
        int GetItemsCount();
        List<IProduct> Items();
        bool IsEmpty();
        void EmptyShoppingCart();
        void AddProduct(int count, IProduct product);
        void RemoveProduct(int count, string product);
        
        double GetTotal();
        double TransportPrice { get; }
        
        string GetUsuari();
        void AddUsuari(IUsuari usuari);
    }
}