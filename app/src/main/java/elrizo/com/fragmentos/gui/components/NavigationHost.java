package elrizo.com.fragmentos.gui.components;

import androidx.fragment.app.Fragment;

public interface NavigationHost {

    void navigateTo(Fragment fragment, boolean addToBackStack);
}
